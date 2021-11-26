package study.nomember.day25;


import java.util.Scanner;

public class No20154 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int[] score = new int[]{
                3, 2, 1, 2, 3,
                3, 3, 3, 1, 1,
                3, 1, 3, 3, 1,
                2, 2, 2, 1, 2,
                1, 1, 2, 2, 2,
                1
        };
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int n = str.charAt(i) - 'A';
            sum += score[n];

            if (sum > 10) {
                sum %= 10;
            }
        }
        System.out.println(sum % 2 != 0  ? "I'm a winner!" : "You're the winner?");
    }
}
