package Recursionfile;

import java.util.*;

class IsUpperCase {

    // Given a string find its first uppercase letter

    // Input : geeksforgeeKs
    // Output : K

    // Input : geekS
    // Output : S

    public static void main(String[] args) {
        String str = "geekS";
        IsUpperCase_Found(str, 0);

    }

    public static void IsUpperCase_Found(String a, int i) {
        if (i > a.length() - 1)
            System.out.println("Upper Case Not Found");

        else {
            if (Character.isUpperCase(a.charAt(i)))
                System.out.println("Present Character" + " " + a.charAt(i));
            else
                IsUpperCase_Found(a, i + 1);
        }

    }
}