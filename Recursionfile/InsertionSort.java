package Recursionfile;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6 };
        insertionSort(arr, 1, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] a, int j, int n) {
        int temp = a[j];
        int start = j;

        if (a[start] > temp && start >= 0) {
            a[start] = a[start - 1];
            start--;
        }

        a[start] = temp;

        if (j + 1 <= n) {
            insertionSort(a, j + 1, n);
        }
    }
}
