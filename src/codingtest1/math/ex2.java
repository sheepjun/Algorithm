package codingtest1.math;

import java.util.Scanner;

/**
 * 에라토스테네스의 체
 * m이상 n이하의 소수 찾기
 */
public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[] check = new boolean[m + 1];
//        System.out.println("check = " + check.length);
        for (int i = 2; i <= m; i++) {
//            System.out.println("check" + i + " = " + check[i]);
        }
        check[0] = check[1] = true;
        for (int i = 2; i * i <= m; i++) {
            if (check[i] == true) {
                System.out.println("i = " + i);
                continue;
            }
            System.out.println("i = " + i);
            for (int j = i + i; j <= m; j += i) {
                check[j] = true;
//                System.out.println("check" + j + " = " + check[j]);
            }
        }
        for (int i = n; i <= m; i++) {
            if (check[i] == false) {
                System.out.println(i);
            }
        }
    }
}
