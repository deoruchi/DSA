package Recursionfile;

import java.util.*;;

public class primeNUmber {
    // Given a number n, check whether it’s prime number or not using recursion.
    // Examples:

    // Input : n = 11
    // Output : Yes

    // Input : n = 15
    // Output : No
    public static void main(String[] args) {
        System.out.println("Enter the number : check whether it is prime or not");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("status of number");
        String c = checkPrime(n, 2);
        System.out.println(c);
    }

    public static String checkPrime(int n, int d) {
        // we are taking the divisor to root under n
        // base case
        // if number is smaller than 2
        if (n <= 2) {
            if (n == 2) {
                return "prime";
            } else
                return "not a prime";
        }
        // if divisible by divisor

        if (n % d == 0) {
            return "not a prime";
        }
        // if divisor square is greater than number

        if (d * d > n)
            return "prime";

        // increament the divisor if not true
        return checkPrime(n, d + 1);
    }
}
