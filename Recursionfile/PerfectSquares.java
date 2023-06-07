package Recursionfile;

import java.util.*;

public class PerfectSquares {
    public static void main(String[] args) {
        int n = 24;

        helper(n, 2, 0);
    }

    public static void helper(int n, int i, int c) {

        if (i == 10) {
            if (n != 0)
                return;
        }
        if (n == 0) {
            System.out.println(c);
            return;
        }
        if (n > 0) {
            helper(n - i * i, i, c + 1);
            helper(n, i + 1, c);
        }

    }
}
