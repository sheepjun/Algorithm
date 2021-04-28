package codingtest1.math;

import java.util.Scanner;

public class PrimeNumber {

    public static boolean is_prime(int x) {
        if (x <= 1) {
            return false;
        } else if (x == 2) {
            return true;
        }

        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                System.out.println("i = " + i);
                System.out.println("x = " + x);
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        while (n-- > 0) {
            if (is_prime(sc.nextInt())) {
                ans += 1;
            }
        }
        System.out.println("ans = " + ans);
    }
}
