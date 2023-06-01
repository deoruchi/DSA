package Recursionfile;

import java.util.*;

public class Pow {

    public static void main(String[] args) {
        double x = 2.00;
        int n = -2;
        if (n < 0) {

            System.out.println(1 / powth(x, -n));
        }
        System.out.println(powth(x, n));
    }

    private static double powth(double t, int s) {
        if (s <= 0)
            return 1;
        double c = t * powth(t, s - 1);
        return c;
    }
}
