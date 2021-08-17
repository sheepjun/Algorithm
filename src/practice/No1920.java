package practice;

import java.util.*;

public class No1920 {

    static int binarySearch(int[] a, int key, int left, int right) {
        int mid;

        while (right >= left) {
            mid = (right + left) / 2;

            if (key == a[mid]) {
                return 1;
            } else if (key > a[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            System.out.println(binarySearch(a, b[i], 0, a.length-1));
        }
    }
}
