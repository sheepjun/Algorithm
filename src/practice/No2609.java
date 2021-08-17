package practice;

import java.util.Scanner;

public class No2609 {

    static int gcd(int n, int m) {
        if (m == 0) {
            return n;
        } else {
            return gcd(m, n % m);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int g = gcd(n, m);
        int l = n*m/g;

        System.out.println(g);
        System.out.println(l);
    }
}
