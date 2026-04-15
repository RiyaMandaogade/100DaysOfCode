// DAY 002 — Stones on the Table (Codeforces 266A)
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int removed = 0;
        String prev = "";

        for (int i = 0; i < n; i++) {
            String curr = st.nextToken();
            if (curr.equals(prev)) {
                removed++;
            } else {
                prev = curr;
            }
        }

        System.out.println(removed);
    }
}
