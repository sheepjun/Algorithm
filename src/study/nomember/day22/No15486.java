package study.nomember.day22;

import java.io.*;
import java.util.StringTokenizer;

public class No15486 {

    static int n;
    static int[] t;
    static int[] p;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        t = new int[n + 2];
        p = new int[n + 2];

        for (int i = 1; i < n + 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            t[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[n + 2];
        int max = 0;
        for (int i = 1; i < n + 2; i++) {
            if (max < dp[i]) {
                max = dp[i];
            }

            int day = i + t[i];
            if (day < n + 2) {
                dp[day] = Math.max(dp[day], max + p[i]);
            }
        }

        System.out.println(max);

    }
}
