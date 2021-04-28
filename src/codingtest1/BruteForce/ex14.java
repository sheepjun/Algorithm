//package codingtest1.BruteForce;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
///**
// * 문제
// * N이 주어졌을 때, 1부터 N까지의 수로 이루어진 순열을 사전순으로 출력하는 프로그램을 작성하시오.
// */
//public class ex14 {
//
//    public static boolean permutation(int[] a) {
//        int i = a.length -1;
//        while (i > 0 && a[i - 1] >= a[i]) {
//            i -= 1;
//        }
//
//        if (i <= 0) {
//            return false;
//        }
//
//        int j = a.length - 1;
//        while (a[j] <= a[i - 1]) {
//            j -= 1;
//        }
//        int temp = a[i-1];
//        a[i-1] = a[j];
//        a[j] = temp;
//
//        j = a.length - 1;
//        while (i < j) {
//            temp = a[i];
//            a[i] = a[j];
//            a[j] = temp;
//            i += 1;
//            j -= 1;
//        }
//
//        return true;
//    }
//
//    public static int calculatoe(int[] a) {
//        int sum = 0;
//        for (int i = 1; i < a.length; i++) {
//            sum += Math.abs(a[i] - a[i - 1]);
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//        Arrays.sort(a);
//        int ans = 0;
//        do {
//            int temp = calculatoe(a);
//            ans = Math.max(temp, ans);
//        } while (permutation(a));
//
//        System.out.println(ans);
//    }
//}
