import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());

            Set<Integer> present = new HashSet<>();
            for (int i = 0; i < n; i++) {
                present.add(Integer.parseInt(st.nextToken()));
            }

            int mex = 0;
            while (present.contains(mex)) mex++;

            sb.append(mex).append('\n');
        }

        System.out.print(sb);
    }
}
