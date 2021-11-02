package practice;

import java.util.*;

public class No2580 {

    static int[][] a = new int[9][9];

    static void sudo(int row, int col) {
        if (col == 9) {
            sudo(row+1, 0);
            return;
        }

        if (row == 9) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sb.append(a[i][j]).append(' ');
                }
                sb.append('\n');
            }
            System.out.println(sb);
            System.exit(0);
        }

        if (a[row][col] == 0) {
            for (int i = 1; i <= 9; i++) {
                if (possibility(row, col, i)) {
                    a[row][col] = i;
                    sudo(row, col+1);
                }
            }
            a[row][col] = 0;
            return;
        }
        sudo(row, col+1);
    }

    static boolean possibility(int row, int col, int value) {

        for (int i = 0; i < 9; i++) {
            if (a[row][i] == value) {
                return false;
            }
        }

        for (int i = 0; i < 9; i++) {
            if (a[i][col] == value) {
                return false;
            }
        }

        int set_row = (row / 3) * 3;
        int set_col = (col / 3) * 3;

        for (int i = set_row; i < set_row + 3; i++) {
            for (int j = set_col; j < set_col + 3; j++) {
                if (a[i][j] == value) {
                    return false;
                }
            }
        }

        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                a[i][j] = sc.nextInt();
            }
        }


        sudo(0,0);
    }
}
