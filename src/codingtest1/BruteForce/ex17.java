package codingtest1.BruteForce;

import java.util.Scanner;

public class ex17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 1; i < (1 << n); i++) {
            int sum = 0;
            for (int k = 0; k < n; k++) {
                if ((i & (1 << k)) != 0) {
                    System.out.println("i = " + i);
                    System.out.println("a[k] = " + a[k]);
                    sum += a[k];
                    System.out.println("sum = " + sum);
                }
            }
            if (sum == s) {
                ans += 1;
            }
        }
        System.out.println("ans = " + ans);

    }
}
