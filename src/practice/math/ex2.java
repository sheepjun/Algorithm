package practice.math;

import java.util.Scanner;

/**
 * 백준1037번
 */
public class ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int small, big;
        small = a[0];
        big = a[0];
        for (int i = 1; i < n; i++) {
            if (small > a[i]) {
                small = a[i];
            }
            if (big < a[i]) {
                big = a[i];
            }
        }

        System.out.println(small*big);
    }
}
