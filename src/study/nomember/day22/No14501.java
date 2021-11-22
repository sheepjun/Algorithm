package study.nomember.day22;

import java.io.*;
import java.util.StringTokenizer;

public class No14501 {

    static int n;
    static int[][] arr;
    static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n+1][2];

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        go(1,0);

    }

    static void go(int index, int sum) {

        if (max < sum) max = sum;

        if (index > n) return;

        int tmp = index + arr[index][0];

        if (tmp <= n + 1) {
            go(tmp, sum + arr[index][1]);
        }

        go(index+1, sum);


    }
}
