package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No10815 {

    static int binarySearch(int[] a, int key, int left, int right) {

        int mid;

        while (left <= right) {
            mid = (left+right)/2;

            if (key == a[mid]) {
                return 1;
            } else if (key > a[mid]) {
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }

        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            if (binarySearch(a, Integer.parseInt(st.nextToken()), 0, a.length-1) == 1) {
                sb.append('1').append(" ");
            } else {
                sb.append('0').append(" ");
            }
        }
        System.out.println(sb);
    }
}
