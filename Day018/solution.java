import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            long[] a = new long[n];
            long[] b = new long[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) a[i] = Long.parseLong(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) b[i] = Long.parseLong(st.nextToken());

            long sumHi = 0, maxLo = 0;
            for (int i = 0; i < n; i++) {
                long hi = Math.max(a[i], b[i]);
                long lo = Math.min(a[i], b[i]);
                sumHi += hi;
                maxLo = Math.max(maxLo, lo);
            }

            sb.append(sumHi + maxLo).append('\n');
        }

        System.out.print(sb);
    }
}
