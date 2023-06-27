
import java.util.*;

import Recursionfile.remove;

class MyStack2 {
    Queue<Integer> q;

    public MyStack2() {
        q = new LinkedList<>();
    }

    public void push(int x) {

        q.add(x);

        for (int i = 0; i < q.size() - 1; i++) {
            int a = q.poll();
            q.add(a);
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

        MyStack2 stack2 = new MyStack2();
        stack2.push(9);
        stack2.push(12);
        stack2.push(23);

        System.out.println(stack2.pop());
        System.out.println(stack2.top());
        System.out.println(stack2.pop());
        System.out.println(stack2.empty());
    }

}