import java.util.LinkedList;
import java.util.Queue;

public class Reversekele {
    private static void reverse(Queue<Integer> q, int k) {
        for (int i = 0; i < q.size() - k; i++) {
            q.offer(q.poll());
        }
    }

    // Function to reverse first k elements of a queue.
    public static void modifyQueue(Queue<Integer> q, int k) {
        // add code here.

        int arr[] = new int[k];

        for (int i = k - 1; i >= 0; i--) {
            arr[i] = q.poll();
        }

        for (int a : arr) {
            q.offer(a);
        }

        reverse(q, k);

        System.out.println(q);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(12);
        q.offer(23);
        q.offer(34);
        q.offer(56);
        q.offer(45);
        modifyQueue(q, 3);
    
    }
}
