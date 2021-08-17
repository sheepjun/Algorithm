package practice;

import java.io.*;
import java.util.StringTokenizer;

public class No14889 {

    static int n;
    static int[][] a;
    static boolean[] visit;
    static int Min = Integer.MAX_VALUE;

    static void combi(int idx, int count) {
        if (count == n/2) {
            diff();
            return;
        }

        for (int i = idx; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                combi(idx+1, count+1);
                visit[i] = false;
            }
        }
    }

    static void diff() {
        int start_team = 0;
        int link_team = 0;

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++ ) {
                if (visit[i] && visit[j]) {
                    start_team = a[i][j] + a[j][i];
                } else if (!visit[i] && !visit[j]) {
                    link_team = a[i][j] + a[j][i];
                }
            }
        }

        int val = Math.abs(start_team - link_team);

        if (val == 0) {
            System.out.println(val);
            System.exit(0);
        }
        if (val < Min) Min = val;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        a = new int[n][n];
        visit = new boolean[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        combi(0,0);
        System.out.println(Min);
    }
}
