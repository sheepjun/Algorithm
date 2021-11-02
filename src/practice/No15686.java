package practice;

import java.util.*;

public class No15686 {

    static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int n;
    static int m;
    static int[][] city;
    static List<Point> house;
    static List<Point> chicken;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        house = new ArrayList<>();
        chicken = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                city[i][j] = sc.nextInt();

                if (city[i][j] == 1) {
                    house.add(new Point(i, j));
                }
                else if (city[i][j] == 2) {
                    chicken.add(new Point(i, j));
                }
            }
        }


    }

}
