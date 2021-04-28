package codingtest1.Simulation;

import java.util.Scanner;

public class no14891ver1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        char[][] a = new char[4][8];
        for (int i=0; i<n; i++) {
            a[i] = sc.next().toCharArray();
        }




        int k = sc.nextInt();
        while (k-- > 0) {
            int no = sc.nextInt()-1;
            int dir = sc.nextInt();
            int[] d = new int[n];
            d[no] = dir;
            //왼쪽 톱니바퀴
            for (int i=no-1; i>=0; i--) {
                if (a[i][2] != a[i+1][6]) {
                    d[i] = -d[i+1];
                } else {
                    break;
                }
            }
            //오른쪽 톱니바퀴
            for (int i=no+1; i<n; i++) {
                if (a[i-1][2] != a[i][6]) {
                    d[i] = -d[i-1];
                } else {
                    break;
                }
            }

            for (int i = 0; i < n; i++) {
                if (d[i] == 0) continue;
                if (d[i] == 1) {
                    char temp = a[i][7];
                    for (int j=7; j>=1; j--) {
                        a[i][j] = a[i][j-1];
                    }
                    a[i][0] = temp;
                } else if (d[i] == -1) {
                    char temp = a[i][0];
                    for (int j=0; j<7; j++) {
                        a[i][j] = a[i][j+1];
                    }
                    a[i][7] = temp;
                }
            }
        }
        int ans = 0;
        for (int i=0; i<n; i++) {
            if (a[i][0] == '1') {
                ans |= (1<<i);
            }
        }
        System.out.println(ans);
    }
}
