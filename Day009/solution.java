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

            int zeros = 0, negatives = 0;
            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(st.nextToken());
                if (x == 0) zeros++;
                else if (x == -1) negatives++;
            }

            int ops = zeros;
            if (negatives % 2 == 1) ops += 2;

            sb.append(ops).append('\n');
        }

        System.out.print(sb);
    }
}
