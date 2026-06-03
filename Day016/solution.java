import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] a = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());

            int[] label = new int[n];
            Arrays.fill(label, -1); // -1=free, 0=unboosted, 1=boosted

            boolean impossible = false;
            long lowerK = 1;

            // Step 1: Force labels from descents
            for (int i = 0; i < n - 1 && !impossible; i++) {
                if (a[i] > a[i + 1]) {
                    if (label[i] == 1 || label[i + 1] == 0) {
                        impossible = true;
                    } else {
                        label[i] = 0;
                        label[i + 1] = 1;
                        lowerK = Math.max(lowerK, (long)(a[i] - a[i + 1]));
                    }
                }
            }

            // Step 2: Propagate 1s rightward through flat pairs
            for (int i = 0; i < n - 1 && !impossible; i++) {
                if (a[i] == a[i + 1] && label[i] == 1) {
                    if (label[i + 1] == 0) impossible = true;
                    else label[i + 1] = 1;
                }
            }

            // Step 3: Propagate 0s leftward through flat pairs
            for (int i = n - 2; i >= 0 && !impossible; i--) {
                if (a[i] == a[i + 1] && label[i + 1] == 0) {
                    if (label[i] == 1) impossible = true;
                    else label[i] = 0;
                }
            }

            long upperK = Long.MAX_VALUE / 2;

            if (!impossible) {
                // Step 4: For each forced-1 followed by forced-0 (with free positions
                // in between), find max gap for optimal 10 transition placement
                int i = 0;
                while (i < n) {
                    if (label[i] == 1) {
                        int j = i + 1;
                        while (j < n && label[j] == -1) j++;

                        if (j < n && label[j] == 0) {
                            // Must place 10 transition in [i, j-1]
                            // Find max strict-ascent gap
                            long maxGap = 0;
                            for (int r = i; r < j; r++) {
                                if (a[r + 1] > a[r]) {
                                    maxGap = Math.max(maxGap, (long)(a[r + 1] - a[r]));
                                }
                            }
                            if (maxGap == 0) { impossible = true; break; }
                            upperK = Math.min(upperK, maxGap);
                        }
                        i = (j < n) ? j : n;
                    } else {
                        i++;
                    }
                }
            }

            sb.append((impossible || lowerK > upperK) ? "No" : "Yes").append('\n');
        }

        System.out.print(sb);
    }
}
