package study.nomember.day4;

/**
 * 상근이는 학생들에게 두 양의 정수 A와 B의 최대공약수를 계산하는 문제를 내주었다. 그런데, 상근이는 학생들을 골탕먹이기 위해 매우 큰 A와 B를 주었다.
 *
 * 상근이는 N개의 수와 M개의 수를 주었고, N개의 수를 모두 곱하면 A, M개의 수를 모두 곱하면 B가 된다.
 *
 * 이 수가 주어졌을 때, 최대공약수를 구하는 프로그램을 작성하시오.
 */

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class No2824 {

    static void gcd(BigInteger a, BigInteger b) {
        BigInteger big = a.compareTo(b) > 0 ? a:b;
        BigInteger small = a.compareTo(b) > 0 ? b:a;
        BigInteger zero = new BigInteger("0");
        while (true) {
            BigInteger mod = big.mod(small);

            if (mod.compareTo(zero) == 0) break;

            big = small;
            small = mod;
        }

        String ans = small.toString();

        if (ans.length() > 9) {
            ans = ans.substring(ans.length() - 9, ans.length());
        }
        System.out.println(ans);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        BigInteger a = new BigInteger("1");

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a = a.multiply(new BigInteger(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());

        BigInteger b = new BigInteger("1");

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            b = b.multiply(new BigInteger(st.nextToken()));
        }

        gcd(a,b);

    }
}
