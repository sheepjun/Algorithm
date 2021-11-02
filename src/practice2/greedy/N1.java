package practice2.greedy;


import java.util.Scanner;

/**
 * 1로 만들기 문제
 */
public class N1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int result = 0;

        while(true) {

            int target = (n / k) * k;
            result += (n - target);
            n = target;

            if (n < k) break;

            n /= k;
            result += 1;
        }
        result += (n - 1);
        System.out.println(result);
    }
}
