package practice;

import java.io.*;
import java.util.*;

public class No9095 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int[] d = new int[12];
        d[1] = 1;
        d[2] = 2;
        d[3] = 4;

        for (int i = 4; i <= 11; i++) {
            d[i] = d[i-3] + d[i-2] + d[i-1];
        }

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            sb.append(d[n]).append('\n');
        }
        System.out.println(sb);
    }
}
