// binary search using the recursion method
package Recursionfile;

import java.util.*;

class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { -1, 0, 3, 5, 9, 12 };
        int ans = BinarySearchNumber(arr, 0, arr.length - 1, 13);
        System.out.println(ans);
    }

    public static int BinarySearchNumber(int[] a, int s, int e, int target) {
        if (s > e)
            return -1;

        int mid = s + (e - s) / 2;

        if (a[mid] == target) {
            return mid;
        }
        if (a[mid] < target) {
            return (BinarySearchNumber(a, mid + 1, e, target));
        }

        return (BinarySearchNumber(a, s, mid - 1, target));

    }
}
