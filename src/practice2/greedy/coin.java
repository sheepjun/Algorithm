package practice2.greedy;

/**
 * 거스름돈 문제
 */

public class coin {

    public static void main(String[] args) {
        int n = 1260;
        int cnt = 0;

        int[] coin = new int[]{500, 100, 50, 10};

        for (int i = 0; i < coin.length; i++) {
            cnt += (n / coin[i]);
            n %= coin[i];
        }
        System.out.println(cnt);
    }
}
