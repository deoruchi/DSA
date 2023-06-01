package Recursionfile;

import java.util.*;

public class Pow {

    public static void main(String[] args) {
        double x = 2.00;
        int n = -2;

        System.out.println(myPow(x, n));
    }

    private static double myPow(double x, int n) {
        if (n == 0)
            return 1.0;

        if (n % 2 == 1)
            return x * myPow(x, n - 1);

        if (n % 2 == 0)
            return myPow(x * x, n / 2);

        return 1 / myPow(x, -n);
    }
}
