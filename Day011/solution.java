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
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            Set<Integer> winners = new HashSet<>();

            // Try each possible starting player
            for (int start = 0; start < n; start++) {
                int[] dishes = Arrays.copyOf(a, n);
                int total = 0;
                for (int x : dishes) total += x;

                int current = start;
                int lastEater = -1;

                while (total > 0) {
                    if (dishes[current] > 0) {
                        dishes[current]--;
                        total--;
                        lastEater = current;
                    }
                    current = (current + 1) % n;
                }

                winners.add(lastEater);
            }

            sb.append(winners.size()).append('\n');
        }

        System.out.print(sb);
    }
}
