package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No2750 {

    static int n;
    static int[] temp;


    static void merge_sort(int[] a, int left, int right) {

        if (left == right) return;
        int mid = (left + right) / 2;

        merge_sort(a, left, mid);
        merge_sort(a, mid+1, right);
        merge(a, left, mid, right);
    }

    static void merge(int[] a, int left, int mid, int right) {
        int l = left;
        int r = mid + 1;
        int idx = left;

        while (l <= mid && r <= right) {

            if (a[l] < a[r]) {
                temp[idx] = a[l];
                l++;

            } else {
                temp[idx] = a[r];
                r++;

            }
            idx++;
        }

        if (l > mid) {
            while (r <= right) {
                temp[idx] = a[r];
                r++;
                idx++;

            }
        } else {
            while (l <= mid) {
                temp[idx] = a[l];
                l++;
                idx++;

            }
        }

        for (int i = 0; i < n; i++) {
            a[i] = temp[i];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        temp = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
            temp[i] = a[i];
        }

        merge_sort(a, 0, a.length-1);

        for (int ans: a) {
            System.out.println(ans);
        }
    }
}
