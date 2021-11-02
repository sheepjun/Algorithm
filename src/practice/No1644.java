package practice;

import java.util.*;

public class No1644 {

    static int n;
    static boolean[] prime;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        prime = new boolean[n+1];
        prime[0] = prime[1] = true;
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i*i <= n; i++) {
            if (!prime[i]) {
                for (int j = i * i; j <= n; j+=i) {
                    prime[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!prime[i]) {
                list.add(i);
            }
        }

        int l = 0;
        int r = 0;
        int sum = 0;
        int cnt = 0;

        while (true) {
            if (sum >= n) {
                sum -= list.get(l++);
            }
            else if (r == list.size()) break;
            else if (sum < n) {
                sum += list.get(r++);
            }

            if (sum == n) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
