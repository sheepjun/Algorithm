package practice;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class No10845 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> q = new LinkedList<>();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            switch(st.nextToken()) {

                case "push":
                    q.offer(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if (q.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(q.poll()).append('\n');
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
