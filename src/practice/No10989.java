package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10989 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] cnt = new int[10001];

        for (int i = 0; i < n; i++) {
            cnt[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 1; i < cnt.length; i++) {
            while (cnt[i] > 0) {
                cnt[i]--;
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }
}
