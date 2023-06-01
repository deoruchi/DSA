package Recursionfile;



public class CheckParanthesis {
    // Check for balanced parenthesis without using stack
    // Given an expression string exp, write a program to examine whether the pairs
    // and the orders of “{“, ”}”, ”(“, ”)”, ”[“, ”]” are correct in exp.
    public static void main(String[] args) {
        String exp = "[()]{}{[()()](}";
        boolean c = checkBalanced(exp, 0, 0, 0, 0);
        System.out.println(c);

    }

    private static boolean checkBalanced(String a, int index, int c, int c2, int c3) {
        if (index == a.length()) {
            return c == 0 && c2 == 0 && c3 == 0;
        }
        char ch = a.charAt(index);
        if (ch == '(')
            c++;
        else if (ch == ')') {
            if (c == 0)
                return false;
            c--;
        }

        if (ch == '[')
            c2++;
        else if (ch == ']') {
            if (c2 == 0)
                return false;
            c2--;
        }

        if (ch == '{')
            c3++;
        else if (ch == '}') {
            if (c3 == 0)
                return false;
            c3--;
        }

        return checkBalanced(a, index + 1, c, c2, c3);

    }
}
