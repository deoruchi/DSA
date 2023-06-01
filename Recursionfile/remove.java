package Recursionfile;
import  java.util.*;
public class remove {
    //Remove all consecutive duplicates from the string
    //Given a string S, The task is to remove all the consecutive duplicate
    // characters of the string and return the resultant string.

//    Input: S= “aaaaabbbbbb”
//    Output: ab
//
//    Input: S = “geeksforgeeks”
//    Output: geksforgeks
//
//    Input: S = “aabccba”
//    Output: abcba
    public static void main(String[] args) {
       String S= "aabccba";
       String SS = newString(S);
       System.out.println(SS);
    }

    private static String newString( String s1) {
        if(s1.length()==1)
            return s1.substring(0);
        char ch = s1.charAt(0);

        if(ch == s1.charAt(1)){
            return ""+ newString(s1.substring(1));
        }
        return ch + newString(s1.substring(1));
    }

}
