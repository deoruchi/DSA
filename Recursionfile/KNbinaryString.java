package Recursionfile;

import java.util.*;

//Find Kth Bit in Nth Binary String
// Given two positive integers n and k, the binary string Sn is formed as follows:

// S1 = "0"
// Si = Si - 1 + "1" + reverse(invert(Si - 1)) for i > 1
// Where + denotes the concatenation operation, reverse(x) returns the reversed string x, and invert(x) inverts all the bits in x (0 changes to 1 and 1 changes to 0).

// For example, the first four strings in the above sequence are:

// S1 = "0"
// S2 = "011"
// S3 = "0111001"
// S4 = "011100110110001"
// Return the kth bit in Sn. It is guaranteed that k is valid for the given n.
public class KNbinaryString {
    public static void main(String[] args) {
        String c = "0";
        int n = 12;
        int k = 1;

        String p = "";
        String ss = helper(p, c, n);
        // String ss = fun(30);
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(n + 1));
        System.out.println(ss);

    }

    // public static String fun(int n) {
    // // in this we write some base conditions given in the question;
    // if (n == 1)
    // return "0";
    // if (n == 2)
    // return "011";
    // if (n == 3)
    // return "0111001";
    // if (n == 4)
    // return "011100110110001";
    // // then we write the formula given in the question
    // return fun(n - 1) + "1" + reverese(inverse(fun(n - 1)));
    // }
    private static String helper(String c, String c2, int k) {
        if (k == 0) {
            return c;
        }

        c = c2 + "1" + reverese(inverse(c2));
        c2 = c;
        return helper(c, c2, k - 1);
    }

    private static String reverese(String c) {
        if (c.length() == 1) {
            return c.substring(0);
        }
        char ch = c.charAt(c.length() - 1);
        return ch + reverese(c.substring(0, c.length() - 1));

    }

    // private static String inverse(String g) {
    // if (g.isEmpty()) {
    // return "";

    // }
    // if (g.charAt(0) == '1')
    // return "0" + inverse(g.substring(1));
    // else
    // return "1" + inverse(g.substring(1));
    // }
    private static String inverse(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1')
                sb.append('0');
            else
                sb.append('1');
        }
        return sb.toString();
    }

}

// solitioni on

// ///class Solution {
// public char findKthBit(int n, int k) {
// String s ="0";
// String s1 = recursion(s,n-1,k);
// return (s1.charAt(k-1));

// }
// String recursion(String s ,int n ,int k){
// if(n==0)
// return s ;
// s = s+"1"+reverse(s);
// return recursion(s,n-1,k);
// }
// String reverse(String s){
// String s3 ="" ;
// StringBuilder s2 = new StringBuilder(s);
// s2.reverse();
// char a[] = s2.toString().toCharArray();
// for(int i= 0 ;i< a.length ;i++){
// if(a[i]=='1')
// a[i] = '0' ;
// else
// a[i]='1';
// }
// return String.valueOf(a) ;

// }
// }