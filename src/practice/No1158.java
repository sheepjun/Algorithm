package practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No1158 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Queue<Integer> q = new LinkedList<>();
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }
        sb.append('<');
        while (q.size() != 1) {
            for (int i = 0; i < k -1; i++) {
                q.offer(q.poll());
            }
            sb.append(q.poll()).append(", ");
        }
        sb.append(q.poll()).append('>');

        System.out.println(sb);

    }
}
