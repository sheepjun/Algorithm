package study.nomember.day23;

import java.io.*;
import java.util.StringTokenizer;

public class No20114 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        char[][] str = new char[h][n*w];
        char[] ans = new char[n];

        for (int i = 0; i < h; i++) {
            String s = br.readLine();
            for (int j = 0; j < n*w; j++) {
                str[i][j] = s.charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {
            ans[i] = '?';
        }


        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n*w; j++) {

                if (str[i][j] != '?') {
                    ans[j/w] = str[i][j];
                }
            }
        }

        for (char c : ans) sb.append(c);

        System.out.println(sb);

    }
}
