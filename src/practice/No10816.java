package practice;

import java.util.*;

public class No10816 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int key = sc.nextInt();
            if (map.containsKey(key)) {
                sb.append(map.get(key)).append(' ');
            } else {
                sb.append(0).append(' ');
            }
        }
        System.out.println(sb);
    }
}
