import java.io.*;
import java.util.*;

public class Snowfall {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());

            // Categorize elements:
            // group6:  divisible by both 2 and 3 (i.e., by 6)
            // group2:  divisible by 2 only (not 3)
            // group3:  divisible by 3 only (not 2)
            // groupN:  divisible by neither 2 nor 3

            List<Integer> group6 = new ArrayList<>();
            List<Integer> group2 = new ArrayList<>();
            List<Integer> group3 = new ArrayList<>();
            List<Integer> groupN = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(st.nextToken());
                boolean div2 = (x % 2 == 0);
                boolean div3 = (x % 3 == 0);
                if (div2 && div3) group6.add(x);
                else if (div2)    group2.add(x);
                else if (div3)    group3.add(x);
                else              groupN.add(x);
            }

            // Strategy:
            // Place group6 first (they're already divisible by 6 individually, 
            // clustering them minimizes "new" cross-boundary pairs).
            //
            // Then place the LARGER of group2/group3 next (more elements = 
            // harder to "escape", so put the bigger block where it can't combine 
            // with the other type).
            //
            // Then groupN (neutral separators).
            //
            // Then the SMALLER of group2/group3 last.
            //
            // This ensures the "only-2" block and "only-3" block are never 
            // in the same subarray together (they're on opposite sides of 
            // either group6+groupN or just groupN), minimising new divisible-by-6 
            // subarrays formed by spanning both types.

            List<Integer> first, second;
            if (group2.size() >= group3.size()) {
                first  = group2;
                second = group3;
            } else {
                first  = group3;
                second = group2;
            }

            // Build output: group6, first, groupN, second
            boolean needSpace = false;
            for (List<Integer> part : new List[]{group6, first, groupN, second}) {
                for (int x : part) {
                    if (needSpace) sb.append(' ');
                    sb.append(x);
                    needSpace = true;
                }
            }
            sb.append('\n');
        }

        System.out.print(sb);
    }
}
