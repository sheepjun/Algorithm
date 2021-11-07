package study.nomember.day7;

import java.io.*;
import java.util.*;

public class No15970 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int point = Integer.parseInt(st.nextToken());
            int color = Integer.parseInt(st.nextToken());

            if (!map.containsKey(color)) {
                map.put(color, new ArrayList<>());
            }
            map.get(color).add(point);
        }

        Set<Integer> integers = map.keySet();

        int sum = 0;

        for (int key : integers) {
            ArrayList<Integer> integers1 = map.get(key);
            Collections.sort(integers1);

            int distance = 0;
            int l = 0;
            int r = 0;

            for (int i = 0; i < integers1.size(); i++) {
                if (i == 0) {
                    distance = integers1.get(i+1) - integers1.get(i);
                } else if (i == integers1.size()-1) {
                    distance = integers1.get(i) - integers1.get(i-1);
                } else {
                    l = integers1.get(i) - integers1.get(i-1);
                    r = integers1.get(i+1) - integers1.get(i);
                    distance = Math.min(l, r);
                }
                sum += distance;
            }
        }
        System.out.println(sum);

    }

}
