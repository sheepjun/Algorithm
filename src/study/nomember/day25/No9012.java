package study.nomember.day25;

import java.util.Scanner;
import java.util.Stack;

public class No9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int t = sc.nextInt();
        for (int i = 0 ; i < t; i++) {
            sb.append(solve(sc.nextLine())).append('\n');
        }
        System.out.println(sb);
    }

    static String solve(String str) {
        int cnt = 0;

        for (char c : str.toCharArray()) {

            System.out.println(cnt);
            if (c == '(') {
                cnt++;
            }
            else if (cnt == 0) {
                System.out.println("sssss");
                return "NO";
            }
            else {
                cnt--;
            }
        }



        if (cnt == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
