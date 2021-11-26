package study;

import java.util.ArrayList;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        System.out.println(st.peek());
        System.out.println(st.size());
    }
}
