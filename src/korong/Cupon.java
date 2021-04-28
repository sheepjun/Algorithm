package korong;

import java.util.Arrays;
import java.util.Scanner;

public class Cupon {
    
    static int[] b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        b = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println("Arrays.toString(b) = " + Arrays.toString(b));
    }
}
