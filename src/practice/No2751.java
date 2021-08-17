package practice;

import java.util.*;

public class No2751 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        List<Integer> a = new ArrayList();

        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        Collections.sort(a);

        for (int ans : a) {
            sb.append(ans).append('\n');
        }
        System.out.println(sb);
    }
}
