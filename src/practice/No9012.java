package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No9012 {

    static String solve(String str) {
        int cnt = 0;

        for (char c : str.toCharArray()) {

            if ( c == '(') {
                cnt++;
            } else if (cnt == 0) {
                return "NO";
            } else {
                cnt--;
            }
        }

        if (cnt == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            sb.append(solve(br.readLine())).append('\n');
        }
        System.out.println(sb);
    }
}
