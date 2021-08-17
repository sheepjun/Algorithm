package practice;

import java.io.*;
import java.util.*;

public class No1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            LinkedList<int[]> q = new LinkedList<>();
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                q.offer(new int[]{i, Integer.parseInt(st.nextToken())});
            }
            int cnt = 0;

            while (!q.isEmpty()) {
                int[] front = q.poll();
                boolean isMax = true;

                for (int i = 0; i < q.size(); i++) {
                    if (front[1] < q.get(i)[1]) {
                        q.offer(front);
                        for (int j = 0; j < i; j++) {
                            q.offer(q.poll());
                        }
                        isMax = false;
                        break;
                    }
                }
                if (!isMax) continue;

                cnt++;
                if (front[0] == m) break;
            }
            sb.append(cnt).append('\n');
        }

        System.out.println(sb);
    }
}
