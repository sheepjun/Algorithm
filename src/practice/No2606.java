package practice;

import java.util.*;
import java.io.*;

public class No2606 {

    static int n;
    static int edge;
    static int[][] net;
    static boolean[] visited;
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        edge = Integer.parseInt(br.readLine());
        net = new int[n+1][n+1];
        visited = new boolean[n+1];

        for (int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            net[a][b] = net[b][a] = 1;
        }

        bfs(1);
        System.out.println(cnt);
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while(!queue.isEmpty()) {
            int temp = queue.poll();

            for (int i = 0; i < n; i++) {
                if (net[temp][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                    cnt++;
                }
            }

        }

    }
}
