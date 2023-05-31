package Recursionfile;

import java.util.Scanner;

public class SumofDigit {

    // Sum of digit of a number using recursion

    // Input : 12345
    // Output : 15

    // Input : 45632
    // Output :20
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("the sum of the given number" + n);
        int c = sumDigit(n);
        System.out.println(c);

    }

    public static int sumDigit(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumDigit(n / 10);
    }
}
