package practice;

import java.util.Scanner;

public class No1978 {

    static boolean primeNum(int num) {
        if (num <= 1) {
            return false;
        }

        if (num == 2) {
            return true;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        while (n-- > 0) {

            int m = sc.nextInt();

            if (primeNum(m)) cnt++;
        }
        System.out.println(cnt);
    }
}
