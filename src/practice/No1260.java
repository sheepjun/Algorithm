package practice;

import java.io.*;
import java.util.*;

public class No1260 {

    static int[][] check;
    static boolean[] visited;
    static int n;
    static int m;
    static int start;
    static StringBuilder sb;

    static void dfs(int i) {
        visited[i] = true;
        sb.append(i).append(' ');

        for (int j = 1; j <= n; j++) {
            if (check[i][j] == 1 && !visited[j]) {
                dfs(j);
            }
        }
    }

    static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;


        while (!queue.isEmpty()) {
            int temp = queue.remove();
            sb.append(temp).append(' ');
            for (int j = 1; j <= n; j++) {
                if (check[temp][j] == 1 && visited[j] == false) {
                    queue.add(j);
                    visited[j] = true;
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        check = new int[1001][1001];
        visited = new boolean[1001];
        sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            check[x][y] = check[y][x] = 1;
        }


        dfs(start);
        System.out.println(sb);

        visited = new boolean[1001];
        sb = new StringBuilder();
        bfs();
        System.out.println(sb);
    }
}
