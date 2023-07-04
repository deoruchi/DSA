import java.util.Scanner;
import java.util.Stack;

public class Redundantparanthesis {
    // Given a string A denoting an expression. It contains the following operators
    // '+', '-', '*', '/'.

    // Chech whether A has redundant braces or not.

    // NOTE: A will be always a valid expression.
    // Input 1:

    // A = "((a+b))"
    // Input 2:

    // A = "(a+(a+b))"
    // Input 3:

    // A = "((a*b)+(c+d))"

    // Output 1:

    // 1
    // Output 2:

    // 0
    // Output 3:

    // 0
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        sc.nextLine();

        // enter the char of the string;
        // check if curr char is )
        // if its prev char is any mentioned operator then pop
        // till ) --and no paranthesis reduntant
        // if prev is ( then there is paranthesis reduntant

        boolean ans = false;
        Stack<Character> st = new Stack();
        for (int i = 0; i < a.length(); i++) {

            if (a.charAt(i) == '(' || a.charAt(i) == '+' || a.charAt(i) == '-' || a.charAt(i) == '*'
                    || a.charAt(i) == '/') {
                st.push(a.charAt(i));
            }

            else if (a.charAt(i) == ')') {
                if (st.peek() == '(')
                    ans = true;
                while (st.peek() == '+' || st.peek() == '-' || st.peek() == '*' || st.peek() == '/') {
                    st.pop();
                }
                st.pop();
            }

        }

        System.out.println(ans);
    }
}
