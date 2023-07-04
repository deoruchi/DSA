import java.util.Scanner;
import java.util.Stack;

public class SortStack {
    // Sort a Stack using recursion
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            st.push(a);
        }
        System.out.println(st);
        sort(st);
        System.out.println(st);
    }

    private static void sort(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }

        int temp = s.peek();
        s.pop();
        sort(s);
        sorti(s, temp);
    }

    private static void sorti(Stack<Integer> s, int p) {
        if (s.isEmpty() || s.peek() > p) {
            s.push(p);
            return;
        }

        int t = s.pop();
        sorti(s, p);
        s.push(t);

    }
}
