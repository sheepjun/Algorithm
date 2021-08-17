package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class No10866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> q = new LinkedList<>();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            switch(st.nextToken()) {

                case "push_front":
                    q.offerFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    q.offerLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    if (q.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(q.pollFirst()).append('\n');
                    }
                    break;
                case "pop_back":
                    if (q.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(q.pollLast()).append('\n');
                    }
                    break;
                case "size":
                    sb.append(q.size()).append('\n');
                    break;
                case "empty":
                    if (q.isEmpty()) {
                        sb.append('1').append('\n');
                    } else {
                        sb.append('0').append('\n');
                    }
                    break;
                case "front":
                    if (q.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(q.peek()).append('\n');
                    }
                    break;
                case "back":
                    if (q.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(q.peekLast()).append('\n');
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}
