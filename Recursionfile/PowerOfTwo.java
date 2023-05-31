package Recursionfile;

import java.util.*;;

public class PowerOfTwo {
    // Power of Two

    // Given an integer n, return true if it is a power of two. Otherwise, return
    // false.

    // An integer n is a power of two, if there exists an integer x such that n ==
    // 2x.
    public static void main(String[] args) {
        System.out.println("Enter the number : to find the number is a power of two, three , four or not");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("STATUS for  power of two");
        boolean c = isPowerOfTwo(n);
        System.out.println(c);
        System.out.println("STATUS for power of three");
        boolean t = isPowerOfTHree(n);
        System.out.println(t);
        System.out.println("STATUS for power of four");
        boolean f = isPowerOfFour(n);
        System.out.println(f);
    }

    private static boolean isPowerOfTwo(int n) {
        if (n == 1)
            return true;
        if (n % 2 != 0 || n == 0) {
            return false;
        }
        return isPowerOfTwo(n / 2);
    }

    private static boolean isPowerOfTHree(int n) {
        if (n == 1)
            return true;
        if (n % 3 != 0 || n == 0) {
            return false;
        }
        return isPowerOfTHree(n / 3);
    }

    private static boolean isPowerOfFour(int n) {
        if (n == 1)
            return true;
        if (n % 4 != 0 || n == 0)
            return false;

        return isPowerOfFour(n / 4);
    }

}
