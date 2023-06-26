import java.util.Deque;
import java.util.LinkedList;

class MyStack {
    Deque<Integer> q;

    public MyStack() {
        q = new LinkedList<Integer>();

    }

    public void push(int x) {
        q.offerFirst(x);
    }

    public int pop() {
        return q.pollFirst();
    }

    public int top() {
        return q.peekFirst();
    }
}

public class im_stackusingdeque {

    public static void main(String[] args) {
        MyStack st = new MyStack();
        st.push(12);
        st.push(23);
        st.push(232);
        st.push(56);

        System.out.println(st.pop());
        System.out.println(st.top());
    }
}
