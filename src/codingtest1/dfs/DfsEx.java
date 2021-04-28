package codingtest1.dfs;

import java.util.Scanner;
import java.util.Stack;

public class DfsEx {

    static final int MAX_N = 10;
    static int N, E;
    static int[][] Graph = new int[MAX_N][MAX_N];
//    static boolean[] Visited = new boolean[MAX_N];

//    static void codingtest1.dfs(int node) {
//        Visited[node] = true;
//        System.out.println(node + " ");
//
//        for (int next = 0; next < N; next++) {
//            if (!Visited[next] && Graph[node][next] != 0)
//                codingtest1.dfs(next);
//        }
//    }

    static void dfs(int node) {
        boolean[] Visited = new boolean[MAX_N];

        Stack<Integer> stack = new Stack<>();
        stack.push(node);

        while (!stack.empty()) {
            int curr = stack.pop();

            if (Visited[curr]) continue;

            Visited[curr] = true;
            System.out.println(curr + " ");

            for (int next = 0; next < N; next++) {
                if (!Visited[next] && Graph[curr][next] != 0) {
                    dfs(next);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        E = sc.nextInt();
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            Graph[u][v] = Graph[v][u] = 1;
        }
        dfs(0);
    }
}
