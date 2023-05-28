package Recursionfile;

import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        char s[] = { 'h', 'e', 'l', 'l', 'o' };
        System.out.println(helper(s, 0, s.length - 1));

    }

    public static char[] helper(char[] a, int s, int e) {
        if (s > e)
            return a;
        char t = a[s];
        a[s] = a[e];
        a[e] = t;
        return helper(a, s + 1, e - 1);
    }
}
