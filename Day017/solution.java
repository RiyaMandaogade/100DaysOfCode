import java.util.*;
import java.io.*;

public class Main {
    static final long INF = (long) 2e18;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] a = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());

            long[] lo = {1L, 1L};
            long[] hi = {INF, INF};
            boolean[] valid = {true, true};

            for (int i = 1; i < n; i++) {
                long[] newLo = {Long.MAX_VALUE, Long.MAX_VALUE};
                long[] newHi = {-1L, -1L};
                boolean[] newValid = {false, false};

                for (int lp = 0; lp <= 1; lp++) {
                    if (!valid[lp]) continue;
                    for (int ln = 0; ln <= 1; ln++) {
                        long cLo = lo[lp], cHi = hi[lp];
                        boolean ok = true;

                        if (lp == 0 && ln == 0) {
                            if (a[i-1] > a[i]) ok = false;
                        } else if (lp == 0 && ln == 1) {
                            cLo = Math.max(cLo, (long) a[i-1] - a[i]);
                        } else if (lp == 1 && ln == 0) {
                            long ub = (long) a[i] - a[i-1];
                            if (ub < 1) ok = false;
                            else cHi = Math.min(cHi, ub);
                        } else {
                            if (a[i-1] > a[i]) ok = false;
                        }

                        if (!ok || cLo > cHi) continue;

                        if (!newValid[ln]) {
                            newValid[ln] = true;
                            newLo[ln] = cLo;
                            newHi[ln] = cHi;
                        } else {
                            newLo[ln] = Math.min(newLo[ln], cLo);
                            newHi[ln] = Math.max(newHi[ln], cHi);
                        }
                    }
                }
                lo = newLo; hi = newHi; valid = newValid;
            }

            boolean ans = false;
            for (int l = 0; l <= 1; l++) {
                if (valid[l] && lo[l] <= hi[l]) { ans = true; break; }
            }
            sb.append(ans ? "Yes" : "No").append('\n');
        }
        System.out.print(sb);
    }
}
