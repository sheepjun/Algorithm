package practice2.brute;


/**
 * 시각 문제
 */
public class No1 {

    static boolean check(int h, int m, int s) {
        if (h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int count = 0;

        for (int i = 0; i < 24; i ++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    if (check(i, j, k)) count++;
                }
            }
        }

        System.out.println(count);
    }
}
