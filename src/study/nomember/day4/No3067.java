package study.nomember.day4;

import java.util.*;

public class No3067 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();


        while (t-- > 0) {
            int[] dp = new int[10001];
            dp[0] = 1;
            int n = sc.nextInt();
            int[] coins = new int[n];
            for (int i = 0; i < n; i++) {
                coins[i] = sc.nextInt();
            }
            int m = sc.nextInt();

            for (int i = 0; i < n; i++) {
                for (int j = coins[i]; j <= m; j++) {
                    if (dp[j - coins[i]] != 10001) {
                        dp[j] += dp[j-coins[i]];
                    }
                }
            }
            sb.append(dp[m]).append("\n");
        }
        System.out.println(sb);
    }
}
