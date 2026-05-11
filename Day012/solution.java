import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            int ans;
            if (n == 2) ans = 2;
            else if (n == 3) ans = 3;
            else if (n % 2 == 0) ans = 0;
            else ans = 1;

            sb.append(ans).append('\n');
        }

        System.out.print(sb);
    }
}
