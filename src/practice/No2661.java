package practice;

import java.io.*;

public class No2661 {

    static int n;

    static void backtracking(String s) {
        if (s.length() == n) {
            System.out.println(s);
            System.exit(0);
        }

        for (int i = 1; i <= 3; i++) {
            if (check(s+i)) {
                backtracking(s+i);
            }
        }
    }

    static boolean check(String s) {
        int len = s.length() / 2;

        for (int i = 1; i <= len; i++) {
            if (s.substring(s.length()-i).equals(s.substring(s.length() - 2 * i, s.length() - i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        backtracking("");
    }
}
