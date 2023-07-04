import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesis {
    // Given a string s containing just the characters '(', ')', '{', '}', '[' and
    // ']', determine if the input string is valid.

    // An input string is valid if:

    // Open brackets must be closed by the same type of brackets.
    // Open brackets must be closed in the correct order.
    // Every close bracket has a corresponding open bracket of the same type.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack();
        boolean ans = false;

        String s = sc.next();
        sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (st.isEmpty())
                st.push(ch);

            else if ((st.peek() == '(' && ch == ')') || (st.peek() == '{' && ch == '}')
                    || (st.peek() == '[' && ch == ']')) {
                st.pop();
            } else {
                st.push(ch);
            }

        }
        if (st.size() == 0) {
            ans = true;
            System.out.println(ans);
        } else
            System.out.println(ans);

    }
}
