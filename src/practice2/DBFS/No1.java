package practice2.DBFS;
import java.io.*;
import java.util.*;

/**
 * 음료수 올려 먹기
 */

public class No1 {

    static int n;
    static int m;
    static int[][] miro;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int cnt = 0;

    static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                if (miro[nx][ny] == 0 && visited[nx][ny] == false) {
                    dfs(nx, ny);
                }
            }
        }
        cnt++;

    }

    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int bfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x, y));

        while(q.isEmpty()) {
            Node node = q.poll();
            x = node.x;
            y = node.y;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (miro[nx][ny] == 0) continue;
                if (miro[nx][ny] == 1) {
                    miro[nx][ny] = miro[x][y] + 1;
                    q.offer(new Node(nx, ny));
                }
            }
        }
        return miro[n-1][m-1];
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        miro = new int[n][m];
        visited = new boolean[n][m];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < m; j++) {
                miro[i][j] = str.charAt(j) - '0';
            }
        }

        System.out.println(bfs(0,0));




    }

}
