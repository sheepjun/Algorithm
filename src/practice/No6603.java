package practice;

import java.io.*;
import java.util.*;

public class No6603 {

    static int n;
    static int[] a;
    static List<Integer> lotto = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();
    static void solve(int[] a, int idx, int cnt) {

        if (cnt == 6) {
            for (int lo : lotto) {
                sb.append(lo).append(' ');
            }
            sb.append('\n');
            return;
        }

        if (idx == a.length) return;

        lotto.add(a[idx]);
        solve(a, idx+1, cnt+1);
        lotto.remove(lotto.size()-1);
        solve(a, idx+1, cnt);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            n = Integer.parseInt(st.nextToken());
            if (n == 0) break;
            a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            solve(a, 0, 0);
            sb.append('\n');
        }
        System.out.println(sb);

    }
}
