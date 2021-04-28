package practice.math;

import java.util.Scanner;

/**
 * 백준 17427번
 */
public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += (n / i) * i;
        }
        System.out.println(ans);
    }
}
