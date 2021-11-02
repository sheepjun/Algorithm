package study.nomember.day3;

import java.util.*;

/**
 * 정수 A를 B로 바꾸려고 한다. 가능한 연산은 다음과 같은 두 가지이다.
 *
 * 2를 곱한다.
 * 1을 수의 가장 오른쪽에 추가한다.
 * A를 B로 바꾸는데 필요한 연산의 최솟값을 구해보자.
 */

public class No16953 {

    static int count(int a, int b) {

        int cnt = 1;

        while (b != a) {
            if (b < a) {
                return -1;
            }

            if (b % 10 == 1) {
                b /= 10;
            } else if (b % 2 == 0) {
                b /= 2;
            } else {
                return -1;
            }
            cnt++;

        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = count(a, b);
        System.out.println(ans);

    }
}
