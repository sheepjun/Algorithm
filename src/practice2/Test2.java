package practice2;

import java.util.*;

public class Test2 {

    static int ans = 0;

    public static void a(int[] attack, int cnt, int sum) {
        if (attack.length == cnt) {
            if (cnt == 3) {
                if (ans < sum) {
                    ans = sum;
                }
            } else {
                return;
            }
        }

        a(attack, cnt+1, sum+attack[cnt]);
        a(attack, cnt+1, sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        int re = sc.nextInt();
        int at = sc.nextInt();
        int[][] fre = {
                {6,18,16,17,2,9,19},
                {8,2,16,3,11,6,19,15,17},
                {5,19,1,4,17,7},
                {6,16,3,6,19,14,12}
        };
        int[] attack = new int[21];

        for (int i = 0; i < re; i++) {
            int v = fre[i].length;
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j < v; j++) {
                if (set.contains(fre[i][j])) continue;
                set.add(fre[i][j]);
                attack[fre[i][j]]++;
            }
        }



        Arrays.sort(attack);


        for (int i : attack) {
            System.out.print(i+ " ");
        }
        int n = attack.length;

        for (int i = 0; i < at; i++) {
            ans += attack[n-1];
            n--;
        }

        System.out.println(ans);

    }
}
