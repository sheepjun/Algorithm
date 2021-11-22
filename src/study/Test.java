package study;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        a.add(new ArrayList<>());
        a.add(new ArrayList<>());
        a.get(0).add(1);
        a.get(1).add(0);
        System.out.println(a.get(0).get(0));
        System.out.println(a.get(1).get(0));
    }
}
