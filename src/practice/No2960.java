package practice;

import java.util.*;

public class No2960 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        boolean[] a = new boolean[n + 1];
        int cnt = 0;

        for (int i = 2; i <= n; i++) {
            a[i] = true;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = i; i <= n; j+=i) {
                if (!a[j]) continue;
                a[j] = false;
                cnt++;
                if (cnt == k) {
                    System.out.println(j);
                    System.exit(0);
                }
            }
        }



    }

}
