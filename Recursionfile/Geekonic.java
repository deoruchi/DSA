package Recursionfile;

import java.util.*;

public class Geekonic {
    // Geek-onacci Number
    // Given four integers A, B, C and N, where A, B, C represents the first three
    // numbers of the geekonacci series, the task is to find the Nth term of the
    // geekonacci series.

    // The Nth term of the geekonacci series is the sum of its previous three terms
    // in the series i.e., sum of (N – 1)th, (N – 2)th, and (N – 3)th geekonacci
    // numbers.
    public static void main(String[] args) {
        System.out.println("enter the number of the test cases");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                list.add(sc.nextInt());
            }
            int xc = Math.abs(list.size() - list.get(list.size() - 1));
            list.remove(list.size() - 1);
            findThNumber(list, xc + 1);
        }

    }

    public static void findThNumber(ArrayList<Integer> list, int xc) {
        if (xc == 0) {
            System.out.println(list.get(list.size() - 1));
            return;
        }
        int n = list.size();
        int sum = list.get(n - 1) + list.get(n - 2) + list.get(n - 3);
        list.add(sum);
        xc--;
        findThNumber(list, xc);
    }
}
