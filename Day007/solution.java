import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long c = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());

            long[] a = new long[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(st.nextToken());
            }

            Arrays.sort(a);

            // Step 1: Kill all killable monsters greedily, track total headroom
            long totalHeadroom = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] <= c) {
                    totalHeadroom += (c - a[i]); // flops we could use here
                    c += a[i];
                }
            }

            // Step 2: Use as many flip flops as possible on killed monsters
            c += Math.min(k, totalHeadroom);

            sb.append(c).append('\n');
        }
        System.out.print(sb);
    }
}
