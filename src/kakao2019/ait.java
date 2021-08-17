package kakao2019;

import java.util.*;
import java.util.stream.Collector;

public class ait {

    static void test1(int k, int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = k;
        }
        if (k > 0) {
            k = 5;
        }
    }

    static int test2(int k) {
        k = 5;
        return k;
    }

    public static void main(String[] args) {

        int k = 1;
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = i;
        }
        for (int ans : a) {
            System.out.print(ans);
        }
        System.out.println();
        test1(k, a);
        for (int ans : a) {
            System.out.print(ans);
        }
        System.out.println(k);

    }
}
