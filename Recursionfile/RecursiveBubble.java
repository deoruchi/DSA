package Recursionfile;

public class RecursiveBubble {
    // bubble sort using recursion
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 2, 5 };
        bubleSort(arr, arr.length - 1, 0);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] bubleSort(int[] a, int s, int e) {

        if (s == 0) {
            return a;
        }
        if (e < s) {
            if (a[s] < a[e]) {
                int temp = a[s];
                a[s] = a[e];
                a[e] = temp;

            }
            return bubleSort(a, s, e + 1);
        } else
            return bubleSort(a, s - 1, 0);

    }
}
