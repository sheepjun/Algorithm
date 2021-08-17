package algorithmtest;

import java.util.*;

public class CountingSort {

    public static void main(String[] args) {
        int[] array = {7, 2, 3, 5, 7, 1, 4, 6, 7, 5, 0, 1};
        int[] counting = new int[8];
        int[] result = new int[12];

//        for (int i = 0; i < 100; i++) {
//            array[i] = (int) (Math.random() * 31);
//        }

        for (int i = 0; i < array.length; i++) {
            counting[array[i]]++;
        }

        // Counting chrl 배열
        System.out.println("counting[]");
        for(int i = 0; i < counting.length; i++) {
            if(i % 10 == 0) System.out.println();
            System.out.print(counting[i] + "\t");
        }
        System.out.println("\n\n");

        for (int i = 1; i < counting.length; i++) {
            counting[i] = counting[i-1] + counting[i];
        }

        for (int i = array.length-1; i >= 0; i--) {
            int value = array[i];
            counting[value]--;
            result[counting[value]] = value;
        }

        // 초기 배열
        System.out.println("array[]");
        for(int i = 0; i < array.length; i++) {
            if(i % 10 == 0) System.out.println();
            System.out.print(array[i] + "\t");
        }
        System.out.println("\n\n");




        // Counting 배열
        System.out.println("counting[]");
        for(int i = 0; i < counting.length; i++) {
            if(i % 10 == 0) System.out.println();
            System.out.print(counting[i] + "\t");
        }
        System.out.println("\n\n");


        // 정렬된 배열
        System.out.println("result[]");
        for(int i = 0; i < result.length; i++) {
            if(i % 10 == 0) System.out.println();
            System.out.print(result[i] + "\t");
        }
        System.out.println();
    }

}
