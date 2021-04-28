package codingtest1.BruteForce;

import java.util.Scanner;

/**
 * 브루트 포스 날짜 계산
 */
public class ex3 {
    static int ex3_1(int E, int S, int M) {
        int e = 1, s = 1, m = 1;
        int year;
        for (int i = 1; ; i++) {
            if (e == E && s == S && m == M) {
                System.out.println("i = " + i);
                year = i;
                break;
            }
            e += 1;
            s += 1;
            m += 1;

            if (e == 16) {
                e = 1;
            }

            if (s == 29) {
                s = 1;
            }

            if (m == 20) {
                m = 1;
            }

        }
        return year;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int E = sc.nextInt() - 1;
        int S = sc.nextInt() - 1;
        int M = sc.nextInt() - 1;
        /**
         * 방법 1
         */
//        ex3_1(E, S, M);
        /**
         * 방법 2
         */
        for (int i = 0; ; i++) {
            if (i % 15 == E && i % 28 == S && i % 19 == M) {
                System.out.println("i = " + (i+1));
                break;
            }
        }
    }

}

