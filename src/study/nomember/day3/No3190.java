package study.nomember.day3;

import java.util.*;
import java.io.*;

public class No3190 {

    static int n;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static Map<Integer, String> dir;
    static List<int[]> snake;
    static int time;

//    static boolean isFinish(int nx, int ny) {
//
//        if (nx < 0 || ny < 0 || nx > n || ny > n) return true;
//
//        for (int i = 0; i < snake.size(); i++) {
//            if (nx ==snake.get(i)[0])
//        }
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        int[][] board = new int[n][n];

        int k = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            board[r][c] = 1;
        }

        int l = Integer.parseInt(br.readLine());
        dir = new HashMap<>();
        for (int i = 0; i < l; i++) {
            st = new StringTokenizer(br.readLine());
            int timeInfo = Integer.parseInt(st.nextToken());
            String directionInfo = st.nextToken();
            dir.put(timeInfo, directionInfo);
        }

        int index = 0;

        snake = new LinkedList<>();
        snake.add(new int[]{0,0});
        time = 0;
        int nx, ny;
        int cx, cy;
        cx = 0;
        cy = 0;

        while (true) {
            time++;

            nx = cx + dx[index];
            ny = cy + dx[index];

//            if(isFinish(nx, ny)) break;
        }


    }
}
