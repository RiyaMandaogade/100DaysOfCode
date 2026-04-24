import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            char[] s = br.readLine().trim().toCharArray();

            // --- MAXIMUM ---
            // Greedily fill any 0 that is between two 1s, repeat until no change
            char[] maxArr = Arrays.copyOf(s, n);
            boolean changed = true;
            while (changed) {
                changed = false;
                for (int i = 1; i < n - 1; i++) {
                    if (maxArr[i] == '0' && maxArr[i-1] == '1' && maxArr[i+1] == '1') {
                        maxArr[i] = '1';
                        changed = true;
                    }
                }
            }
            int maxOnes = 0;
            for (char c : maxArr) if (c == '1') maxOnes++;

            // --- MINIMUM ---
            // Greedily remove any 1 that is between two 1s, repeat until no change
            char[] minArr = Arrays.copyOf(s, n);
            changed = true;
            while (changed) {
                changed = false;
                for (int i = 1; i < n - 1; i++) {
                    if (minArr[i] == '1' && minArr[i-1] == '1' && minArr[i+1] == '1') {
                        minArr[i] = '0';
                        changed = true;
                    }
                }
            }
            int minOnes = 0;
            for (char c : minArr) if (c == '1') minOnes++;

            sb.append(minOnes).append(' ').append(maxOnes).append('\n');
        }
        System.out.print(sb);
    }
}
