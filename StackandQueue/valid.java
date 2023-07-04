import java.util.Stack;

public class valid {
    // Longest Valid Parentheses

    // Given a string containing just the characters '(' and ')', return the length
    // of the longest valid (well-formed) parentheses
    // substring

    // Input: s = ")()())"
    // Output: 4
    // Explanation: The longest valid parentheses substring is "()()".
    public static void main(String[] args) {
        String s = "(())";
        Stack<Character> st1 = new Stack<>();

        int ans = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (st1.isEmpty())
                st1.push(s.charAt(i));
            if (!st1.isEmpty()) {
                if (s.charAt(i) == ')' && st1.peek() == '(') {
                    st1.pop();
                    count += 2;
                } else {
                    ans = Math.max(ans, count);
                    count = 0;
                    st1.push(s.charAt(i));
                }
            }

        }
        System.out.println(ans);
    }

}
