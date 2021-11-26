package study.nomember.day23;

import java.io.*;
import java.util.StringTokenizer;

public class No9094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();


        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int ans = 0;
            for (int i = 2; i < n; i++) {
                int b = i;
                for (int j = 1; j < b; j++) {
                    int a = j;

                    int tmp = (a*a) + (b*b) + m;

                    if (tmp % (a*b) == 0) {
                        ans++;
                    }
                }
            }
            sb.append(ans).append('\n');
        }
        System.out.println(sb);
    }
}
