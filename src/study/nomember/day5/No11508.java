package study.nomember.day5;

import java.util.*;

public class No11508 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(arr[i]);

            if (i % 3 == 0) {
                Collections.sort(list);
                ans += list.get(0);
                list.removeAll(list);
            }
        }

        System.out.println(ans);



    }
}
