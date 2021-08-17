package practice;

import java.io.*;
import java.util.*;

public class No1182 {

    static int n;
    static int s;
    static int[] a;
    static int cnt = 0;

    static void solve(int[] a, int idx, int sum) {
        if (idx == a.length) {
            if (sum == s) {
                cnt++;
                return;
            }
            return;
        }
        solve(a, idx+1, sum+a[idx]);
        solve(a, idx+1, sum);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        a = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        solve(a, 0, 0);

        if (s == 0) cnt--;
        System.out.println(cnt);

    }
}
