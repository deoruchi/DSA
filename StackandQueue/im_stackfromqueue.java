
import java.util.*;

class MyStack {
    Queue<Integer> q;
    Queue<Integer> q2;

    public MyStack() {
        q = new LinkedList<Integer>();
        q2 = new LinkedList<Integer>();
    }

    public void push(int x) {
        if (q.isEmpty() && q.isEmpty()) {
            q.add(x);
        } else {
            while (!q.isEmpty()) {
                q2.add(q.poll());
            }
            q.add(x);

            while (!q2.isEmpty()) {
                q.add(q2.poll());
            }
        }
    }

    public int pop() {
        return q.poll();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}

class im_stackfromqeuue {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(9);
        stack.push(12);
        stack.push(23);

        System.out.println(stack.pop());
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.empty());

    }

}