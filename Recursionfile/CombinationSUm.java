package Recursionfile;

import java.util.*;

public class CombinationSUm {
    public static void main(String[] args) {
        int[] candidates = { 2, 3, 5 };
        int target = 8;
        List<List<Integer>> list1 = new ArrayList<List<Integer>>();
        List<Integer> list2 = new ArrayList<>();
        int index = 0;
        getSum(candidates, target, index, list1, list2);
        System.out.println(list1);

    }

    public static void getSum(int[] a, int t, int i, List<List<Integer>> main, List<Integer> op) {
        if (i == a.length) {
            if (t == 0) {
                main.add(new ArrayList(op));

            }
            return;
        }

        if (a[i] <= t) {
            op.add(a[i]);
            getSum(a, t - a[i], i, main, op);
            op.remove(op.size() - 1);
        }

        getSum(a, t, i + 1, main, op);

    }
}
