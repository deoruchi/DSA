package Recursionfile;

import java.util.*;

public class SmallQuestions {
    // //Given a string calculate length of the string using recursion.
    // Input : str = "abcd"
    // Output :4

    // Input : str = "GEEKSFORGEEKS"
    // Output :13
    public static void main(String[] args) {
        System.out.println("Length of the string");
        String str = "geeksforme";
        System.out.println(String_length(str));

    }

    public static int String_length(String str) {
        if (str.equals("")) {
            return 0;
        }
        return 1 + String_length(str.substring(1));
    }

}
