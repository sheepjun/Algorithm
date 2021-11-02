package practice2.brute;


import java.util.Scanner;

/**
 * 왕실의 나이트
 */
public class No2 {

    static int[] dx = new int[]{2, 2, 1, -1, -2, -2, -1, 1};
    static int[] dy = new int[]{-1, 1, -2, -2, -1, 1, 2, 2};


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] chess = new int[8][8];
        String str = sc.nextLine();
        int x = str.charAt(1) - '0';
        int y = str.charAt(0) - 'a' + 1;
        int cnt = 0;

        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx > 0 && nx < 8 && ny > 0 && ny < 8) cnt++;
        }

        System.out.println(cnt);


    }
}
