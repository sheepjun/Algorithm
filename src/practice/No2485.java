package practice;

import java.util.*;

public class No2485 {

    static int gcd(int a , int b) {

        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] tree = new int[n];
        for (int i = 0; i < n; i++) {
            tree[i] = sc.nextInt();
        }

        int[] dir = new int[n - 1];
        for (int i = 0; i < n-1; i++) {
            dir[i] = tree[i+1] - tree[i];
        }

        int gcd = gcd(dir[0], dir[1]);
        for (int i = 2; i < n-2; i++) {
            gcd = gcd(gcd, dir[i]);
            if (gcd == 1) break;
        }

        int total = 0;
        for (int i = 0; i < n-1; i++) {
            total += (dir[i] / gcd -1);
        }

        System.out.println(total);



    }
}
