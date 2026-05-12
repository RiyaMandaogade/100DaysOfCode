import java.util.*;
import java.io.*;

public class Main {

    static long computeValue(int[] a) {
        long sum = 0;
        int maxSoFar = 0;
        for (int x : a) {
            maxSoFar = Math.max(maxSoFar, x);
            sum += maxSoFar;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] a = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            // Try no swap
            long best = computeValue(a);

            // Try all swaps
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    // Swap
                    int tmp = a[i]; a[i] = a[j]; a[j] = tmp;
                    best = Math.max(best, computeValue(a));
                    // Swap back
                    tmp = a[i]; a[i] = a[j]; a[j] = tmp;
                }
            }

            sb.append(best).append('\n');
        }

        System.out.print(sb);
    }
}
