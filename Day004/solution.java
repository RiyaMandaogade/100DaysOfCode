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

            int[] a = new int[n];
            boolean impossible = false;
            Map<Integer, Integer> freq = new HashMap<>();

            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
                freq.put(a[i], freq.getOrDefault(a[i], 0) + 1);
                if (freq.get(a[i]) > 1) impossible = true;
            }

            if (impossible) {
                sb.append("-1\n");
            } else {
                Arrays.sort(a);
                StringBuilder line = new StringBuilder();
                for (int i = n - 1; i >= 0; i--) {
                    line.append(a[i]);
                    if (i != 0) line.append(" ");
                }
                sb.append(line).append("\n");
            }
        }
        System.out.print(sb);
    }
}
