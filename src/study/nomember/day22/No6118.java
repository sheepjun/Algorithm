package study.nomember.day22;

import java.io.*;
import java.util.*;

public class No6118 {

    static int n, m;
    static ArrayList<ArrayList<Integer>> adj;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        adj = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adj.get(a).add(b);
            adj.get(b).add(a);
        }

        dijkstra(1);
    }

    static void dijkstra(int v) {
        boolean[] visited = new boolean[n+1];
        int[] dist = new int[n+1];

        Arrays.fill(dist, Integer.MAX_VALUE);

        visited[v] = true;
        dist[v] = 0;

        for (int i = 0; i < adj.get(v).size(); i++) {
            int x = adj.get(v).get(i);
            if(!visited[x]) dist[x] = 1;
        }

        for (int i = 0; i < n-1; i++) {
            int min = Integer.MAX_VALUE;
            int minPos = -1;

            for (int j = 1; j <= n; j++) {
                if (!visited[j] && dist[j] != Integer.MAX_VALUE) {
                    if (dist[j] < min) {
                        min = dist[j];
                        minPos = j;
                    }
                }
            }

            visited[minPos] = true;

            for (int j = 0; j < adj.get(minPos).size(); j++) {
                int x = adj.get(minPos).get(j);

                if (!visited[x]) {
                    if (dist[x] > dist[minPos] + 1) {
                        dist[x] = dist[minPos] + 1;
                    }
                }
            }

        }

        int max = -1;
        int maxPos = -1;
        int maxNum = 1;

        for (int i = 1; i <= n; i++) {
            if (max < dist[i]) {
                max = dist[i];
                maxPos = i;
                maxNum = 1;
            }
            else if (max == dist[i])
                maxNum++;
        }

        System.out.println(maxPos + " " + max + " " + maxNum);

    }
}
