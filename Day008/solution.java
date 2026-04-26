import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long cT = Long.parseLong(st.nextToken());
            long cH = Long.parseLong(st.nextToken());
            long cU = Long.parseLong(st.nextToken());

            long rows = 0;

            // Step 1: Best pairing — T+U = 4 rows (saves 2)
            long pairsTU = Math.min(cT, cU);
            cT -= pairsTU;
            cU -= pairsTU;
            rows += 4L * pairsTU;

            // Step 2: T+H pairing = 5 rows (saves 1)
            long pairsTH = Math.min(cT, cH);
            cT -= pairsTH;
            cH -= pairsTH;
            rows += 5L * pairsTH;

            // Step 3: T+T pairing = 5 rows (saves 1)
            long pairsTT = cT / 2;
            cT -= 2L * pairsTT;
            rows += 5L * pairsTT;

            // Step 4: All remaining singles = 3 rows each
            rows += 3L * cT;
            rows += 3L * cH;
            rows += 3L * cU;

            sb.append(rows).append('\n');
        }

        System.out.print(sb);
    }
}
