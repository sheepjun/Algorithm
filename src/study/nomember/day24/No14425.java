package study.nomember.day24;

import java.io.*;
import java.util.StringTokenizer;

public class No14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] strN = new String[n];
        String[] strM = new String[m];

        for (int i = 0; i < n; i++) {
            strN[i] = br.readLine();
        }

        int cnt = 0;

        while (m-- > 0) {
            String str = br.readLine();
            for (String s : strN) {
                if (s.equals(str)) cnt++;
            }
        }

        System.out.println(cnt);


    }

}
