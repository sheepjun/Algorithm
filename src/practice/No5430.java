package practice;

import java.io.*;
import java.util.*;

public class No5430 {

    static StringBuilder sb = new StringBuilder();

    static void AC(String cmd, ArrayDeque<Integer> deque) {
        boolean isRight = true;

        for (char c : cmd.toCharArray()) {
            if (c == 'R') {
                isRight = !isRight;
                continue;
            }

            if (deque.isEmpty()) {
                    sb.append("error").append('\n');
                    return;
            }

            if (isRight) {
                deque.pollFirst();
            } else {
                deque.pollLast();
            }
        }

        sb.append('[');

        if (deque.size() > 0) {

            if (isRight) {
                sb.append(deque.pollFirst());

                while (!deque.isEmpty()) {
                    sb.append(',').append(deque.pollFirst());
                }
            } else {
                sb.append(deque.pollLast());

                while (!deque.isEmpty()) {
                    sb.append(',').append(deque.pollLast());
                }
            }

            sb.append(']').append('\n');

        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String cmd = br.readLine();
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(), "[],");
            ArrayDeque<Integer> deque = new ArrayDeque<>();


           for (int i = 0; i < n; i++) {
               deque.offer(Integer.parseInt(st.nextToken()));
           }

            AC(cmd, deque);

        }
        System.out.println(sb);
    }
}
