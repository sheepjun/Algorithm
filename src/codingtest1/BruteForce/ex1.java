package codingtest1.BruteForce;

import java.util.Scanner;

/**
 * 일곱난쟁이 키 구하기
 */
public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 8;
        int[] a = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (sum - a[i] - a[j] == 100) {
                    for (int k = 0; k < n; k++) {
                        if (i == k || j == k) {
                            continue;
                        }
                        System.out.println("a[k] = " + a[k]);
                    }
                    System.exit(0);
                }
            }
        }
    }
}
