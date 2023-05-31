package Recursionfile;

public class ArraygotSorted {
    // Program to check if
    // an array is sorted or not

    // Given an array of size n, write a program to check if it is sorted in
    // ascending order or not. Equal values are allowed in an array and two
    // consecutive equal values are considered sorted.

    // Input : 20 21 45 89 89 90
    // Output : Yes

    // Input : 20 20 45 89 89 90
    // Output : Yes

    // Input : 20 20 78 98 99 97
    // Output : No

    public static void main(String[] args) {
        int arr[] = { 0, 21, 45, 89, 89, 90 };
        System.out.println("IS the array is sorted");
        boolean c = sortedCheck(arr, 2);
        System.out.println(c);
    }

    public static boolean sortedCheck(int[] a, int n) {
        if (a.length < 2) {
            return true;
        }

        if (n == a.length)
            return true;

        return a[n - 1] <= a[n] && sortedCheck(a, n + 1);

    }
}
