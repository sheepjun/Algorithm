package practice;

import java.util.Scanner;

public class No1929 {

    static boolean[] check;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        check = new boolean[n+1];
        check[0] = check[1] = true;

        for (int i = 2; i*i <= n; i++) {
            if (check[i]) continue;
            for (int j = i+i; j <= n; j+= i) {
                check[j] = true;
            }
        }
        for (int i = m; i < n; i++) {
            if (!check[i]) System.out.println(i);
        }
    }
}
