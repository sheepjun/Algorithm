package codingtest1.DynamicProgramming;

import java.util.Scanner;

/**
 * 문제
 * 2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
 *
 * 아래 그림은 2×5 크기의 직사각형을 채운 한 가지 방법의 예이다.
 */
public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[1001];
        d[0] = 1;
        d[1] = 1;
        for (int i = 2; i <= n; i++) {
            d[i] = d[i - 1] + (d[i - 2] * 2);
            d[i] %= 10007;
        }
        System.out.println("d = " + d[n]);
    }
}
