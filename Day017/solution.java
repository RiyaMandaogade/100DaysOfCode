import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            String s = br.readLine().trim();
            int n = s.length();

            // Step 1: count 4s (must all be removed)
            int fours = 0;
            for (int i = 0; i < n; i++) if (s.charAt(i) == '4') fours++;

            // Step 2: build array without 4s
            int m = n - fours;
            int[] arr = new int[m];
            int idx = 0;
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (c != '4') arr[idx++] = c - '0';
            }

            // Step 3: precompute suffix count of 2s
            int[] suffix2 = new int[m + 1];
            for (int i = m - 1; i >= 0; i--) {
                suffix2[i] = suffix2[i + 1] + (arr[i] == 2 ? 1 : 0);
            }

            // Step 4: sweep cut point, minimize prefix {1,3} + suffix 2s
            int minCost = Integer.MAX_VALUE;
            int prefix13 = 0;
            for (int i = 0; i <= m; i++) {
                minCost = Math.min(minCost, prefix13 + suffix2[i]);
                if (i < m && arr[i] != 2) prefix13++;
            }

            sb.append(fours + minCost).append('\n');
        }

        System.out.print(sb);
    }
}
