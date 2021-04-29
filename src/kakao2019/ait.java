package kakao2019;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ait {
    static class a {
        int a;
        int b;

        public a(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }


    public static void main(String[] args) {
        List<a> list = new ArrayList<>();
        int total = 5;
        int[] stage = {5,4,2,3,3};
        int[] user = new int[5];
        for (int i = 0; i<5; i++) {
            user[i] = stage[i];
        }
        for (int i = 0; i < 5; i++) {
            if (user[i] == 0) {
                list.add(new a(1, 0));
            } else {
                list.add(new a(i + 1, stage[i]));
            }
        }
        for (a s : list) {
            System.out.println(s.a);
        }
        System.out.println(list.get(1).a);
    }
}
