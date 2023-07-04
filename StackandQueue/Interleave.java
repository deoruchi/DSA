import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import Tree.SameTree;

public class Interleave {
    // Given a queue of integers of even length, rearrange the elements by
    // interleaving the first half of the queue with the second half of the queue.
    // We are allowed to use only the queue data structure.

    // Input : 1 2 3 4
    // Output : 1 3 2 4

    // Input : 11 12 13 14 15 16 17 18 19 20
    // Output : 11 16 12 17 13 18 14 19 15 20
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack();
        Scanner sc = new Scanner(System.in);

        int nm = sc.nextInt();
        for (int i = 0; i < nm; i++) {
            q.offer(sc.nextInt());
        }

        System.out.println(q);

        int n = q.size() / 2;

        while (q.size() != n) {
            s.push(q.poll());
        }

        System.out.println(q);

        while (!s.isEmpty()) {
            q.offer(s.pop());
        }

        System.out.println(q);

        while (n != 0) {
            q.offer(q.poll());
            n--;
        }

        System.out.println(q);

        n = q.size() / 2;

        while (q.size() != n) {
            s.push(q.poll());
        }
        System.out.println(q);
        while (!s.isEmpty()) {
            q.offer(s.pop());
            q.offer(q.poll());
        }
        System.out.println(q);
    }
}
