package Recursionfile;

import java.util.*;

public class SumNatural {
    // Given a number n, find sum of first n natural numbers.

    // Input : 3
    // Output : 6
    // Explanation : 1 + 2 + 3 = 6

    // Input : 5
    // Output : 15
    // Explanation : 1 + 2 + 3 + 4 + 5 = 15
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("sum of the natural number");
        int c = sumNaturalNumber(n);
        System.out.println(c);
    }

    public static int sumNaturalNumber(int n) {
        if (n == 0)
            return 0;

        return n + sumNaturalNumber(n - 1);
    }
}
