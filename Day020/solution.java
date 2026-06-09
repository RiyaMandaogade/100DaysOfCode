import java.util.*;
import java.io.*;

public class Main {
    static final int MOD = 676767677;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] a = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());

            // Find last position of element > 1
            int lastBig = -1;
            for (int i = n - 1; i >= 0; i--) {
                if (a[i] > 1) { lastBig = i; break; }
            }

            // All elements are 1
            if (lastBig == -1) {
                sb.append(1 % MOD).append('\n');
                continue;
            }

            // Sum all elements > 1 (each goes alone)
            long sum = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] > 1) sum += a[i];
            }

            // Check if any 1s are stranded after lastBig
            boolean stranded = false;
            for (int i = lastBig + 1; i < n; i++) {
                if (a[i] == 1) { stranded = true; break; }
            }

            long ans = (sum % MOD + (stranded ? 1 : 0)) % MOD;
            sb.append(ans).append('\n');
        }

        System.out.print(sb);
    }
}
