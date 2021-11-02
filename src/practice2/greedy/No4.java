package practice2.greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 모험가 길드
 */
public class No4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int group = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            count += 1;
            if (count >= arr[i]) {
                group += 1;
                count = 0;
            }
        }
        System.out.println(group);

    }
}
