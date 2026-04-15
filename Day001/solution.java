// DAY 001 — Theatre Square (Codeforces 1A)
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        long a = Long.parseLong(st.nextToken());

        long answer = ((n + a - 1) / a) * ((m + a - 1) / a);
        System.out.println(answer);
    }
}
