package practice;

import java.util.*;

public class Test01 {
    static Set<Integer> set = new HashSet<>();

    static void dfs(String str, boolean[] visited, String tmp, int depth) {
        if (tmp.length() == depth) {
            System.out.println(tmp);
            int n = Integer.parseInt(tmp);
            if (isPrime(n)) {
                set.add(n);
                return;
            }
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                tmp += str.charAt(i);
                dfs(str, visited, tmp, depth);
                visited[i] = false;
                tmp = tmp.substring(0, tmp.length() - 1);
            }
        }
    }

    static boolean isPrime(int n) {
        if (n == 0) return false;
        if (n == 1) return false;

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }


    public static void main(String[] args) {

        String numbers = "17";

//        System.out.println(numbers.substring(0,1));

            int len = numbers.length();
            boolean[] visited = new boolean[len];
            for (int i = 0; i < len; i++) {
                dfs(numbers, visited, "", i + 1);
            }

//            for (int i : set) {
//                System.out.println(i);
//            }
            int answer = set.size();

    }
}