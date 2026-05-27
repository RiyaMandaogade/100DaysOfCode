import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            // Construction: [n+1, n+2, ..., 2n]
            // Elements: all distinct, all in [1, 2n] ✓
            // Adjacent sums: (n+1)+(n+2)=2n+3, ..., all > 2n
            // So sums never equal any element ✓
            // Sums form strictly increasing sequence → all distinct ✓
            for (int i = n + 1; i <= 2 * n; i++) {
                sb.append(i);
                if (i < 2 * n) sb.append(' ');
            }
            sb.append('\n');
        }

        System.out.print(sb);
    }
}
