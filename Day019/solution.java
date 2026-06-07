import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();

            if (n % 2 != 0) {
                sb.append("NO\n");
                continue;
            }

            int open = 0;
            for (char c : s.toCharArray()) if (c == '(') open++;

            sb.append(open == n / 2 ? "YES" : "NO").append('\n');
        }

        System.out.print(sb);
    }
}
