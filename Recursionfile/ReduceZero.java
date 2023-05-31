package Recursionfile;

import java.util.*;;

public class ReduceZero {
    // Number of Steps to Reduce a Number to Zero
    // Given an integer num, return the number of steps to reduce it to zero.

    // In one step, if the current number is even, you have to divide it by 2,
    // otherwise, you have to subtract 1 from it.
    public static void main(String[] args) {
        System.out.println("Enter the number : check how may steps it take to reduce to zero");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("status of number of steps");
        int c = steps(n);
        System.out.println(c);
    }

    public static int steps(int num) {
        if (num == 0)
            return 0;
        if (num % 2 == 0)
            return 1 + steps(num / 2);
        else
            return 1 + steps(num - 1);
    }
}
