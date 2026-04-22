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
            int k = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int[] a = new int[k + 2];
            for (int i = 1; i <= k; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            int[] b = new int[n + 1];
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                b[i] = Integer.parseInt(st.nextToken());
            }

            List<Integer> ops = new ArrayList<>();

            for (int lv = k; lv >= 1; lv--) {
                for (int i = 1; i <= n; i++) {
                    if (b[i] == lv) {
                        while (b[i] <= k) {
                            ops.add(i);
                            b[i]++;
                        }
                    }
                }
            }

            sb.append(ops.size()).append('\n');
            for (int i = 0; i < ops.size(); i++) {
                if (i > 0) sb.append(' ');
                sb.append(ops.get(i));
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}
