package study.nomember.day24;

import java.util.Scanner;

public class No9421 {

    static boolean[] prime;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        prime = new boolean[n + 1];

        prime[0] = prime[1] = true;

        for (int i = 2; i*i <= n; i++) {
            if (!prime[i]) {
                for (int j = i*i; j <= n; j+= i) prime[j] = true;
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!prime[i]) {
                if (check(i)) {
                    System.out.println(i);
                }
            }
        }
    }

    static boolean check(int num) {
        String str = String.valueOf(num);
        int cnt = 5;

        while (cnt-- > 0) {
            int sum  = 0;
            for (int i = 0; i < str.length(); i++) {
                int a = str.charAt(i) - '0';

                sum += a*a;
            }
            str = String.valueOf(sum);
        }
        if (str.equals("1")) {
            return true;
        }
        return false;
    }

}
