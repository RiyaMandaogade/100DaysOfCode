import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());

            long groups = n / 3;
            long rem = n % 3;

            long cost = groups * Math.min(b, 3 * a);

            if (rem == 1) cost += Math.min(b, a);
            else if (rem == 2) cost += Math.min(b, 2 * a);

            sb.append(cost).append('\n');
        }

        System.out.print(sb);
    }
}
