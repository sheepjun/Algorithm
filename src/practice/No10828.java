package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class No10828 {

    static int[] stack;
    static int size = 0;

    static void push(int item) {
        stack[size] = item;
        size++;
    }

    static int pop() {
        if (size == 0) {
            return -1;
        } else {
            int res = stack[size-1];
            stack[size-1] = 0;
            size--;
            return res;
        }
    }

    static int size() {
        return size;
    }

    static int empty() {
        if (size > 0) {
            return 0;
        } else {
            return 1;
        }
    }

    static int top() {
        if (size > 0) {
            return stack[size-1];
        } else {
            return -1;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        stack = new int[n];

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {

                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    sb.append(pop()).append('\n');
                    break;
                case "size":
                    sb.append(size()).append('\n');
                    break;
                case "empty":
                    sb.append(empty()).append('\n');
                    break;
                case "top":
                    sb.append(top()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
}
