package study.nomember.day22;

import java.io.*;
import java.util.StringTokenizer;

public class No13305 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        long[] dist = new long[n-1];
        long[] cost = new long[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n-1; i++) {
            dist[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {

            cost[i] = Long.parseLong(st.nextToken());
        }

        long sum = 0;
        long minCost = cost[0];

        for (int i = 0; i < n-1; i++) {
            if (cost[i] < minCost) {
                minCost = cost[i];
            }
            sum += (minCost * dist[i]);
        }

        System.out.println(sum);

    }
}
