package practice;

import java.io.*;
import java.util.*;

public class No1697 {

    static int[] visited = new int[100001];

    static void bfs(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        visited[n] = 1;

        while (!queue.isEmpty()) {
            int x = queue.poll();

            for (int i = 0; i < 3; i++) {
                int next;
                if (i == 0) {
                    next = x - 1;
                } else if (i == 1) {
                    next = x + 1;
                } else {
                    next = x * 2;
                }

                if (next == k) {
                    System.out.println(visited[x]);
                    return;
                }

                if (next >= 0 && next < visited.length && visited[next] == 0) {
                    queue.add(next);
                    visited[next] = visited[x] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        if (n == k) {
            System.out.println(0);
        } else {
            bfs(n, k);
        }

    }
}
