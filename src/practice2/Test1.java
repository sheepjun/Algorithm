package practice2;

import java.util.*;

public class Test1 {

    private static enum OperationsType {
        branch,
        merge;
    }

    private static class Operation {
        OperationsType type;
        Integer value;

        public Operation(OperationsType operationsType, Integer value) {
            this.type = operationsType;
            this.value = value;
        }
    }

    private static  class InputData {
        int numOfOperation;
        Operation[] operations;
    }






    public static void main(String[] args) {

//        Operation op = new Operation(OperationsType.branch, 1);
//        OperationsType type = op.type;
//        String s = type.name();
//        System.out.println(s);
//        if (op.type.name() == "branch") {
//            System.out.println(1);
//        }

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        set.remove(3);

        for (int i : set) {
            System.out.println(i);
        }
//        int trees = 1;
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] t = new int[n+1];
//        for (int i = 1; i <= n; i++) {
//            t[i]++;
//        }
//        String[] str = {"branch", "branch", "branch", "branch", "branch", "merge 2"};
//        StringTokenizer st;
//        List<Integer> tree = new ArrayList<>();
//        tree.add(1);
//        for (int i = 0; i < n; i++) {
//            st = new StringTokenizer(str[i]);
//            String command = st.nextToken();
//            if (command.equals("branch")) {
//                for (int j = 2; j < t.length; j++) {
//                    if (t[j] == 1) {
//                        tree.add(j);
//                        t[j]--;
//                    }
//                }
//            } else if (command.equals("merge")) {
//                System.out.println(command);
//                trees = Integer.parseInt(st.nextToken());
//                t[trees]++;
//                tree.remove(--trees);
//            }
//        }
//
//
//        for (int i : tree) {
//            System.out.print(i + " ");
//        }
    }
}
