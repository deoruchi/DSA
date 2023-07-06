import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Sum {
    public static void main(String[] args) {
        // Given a string of lowercase alphabets and a number k, the task is to print
        // the minimum value of the string after removal of ‘k’ characters. The value of
        // a string is defined as the sum of squares of the count of each distinct
        // character.
        // For example consider the string “saideep”, here frequencies of characters are
        // s-1, a-1, i-1, e-2, d-1, p-1 and value of the string is 1^2 + 1^2 + 1^2 + 1^2
        // + 1^2 + 2^2 = 9.

        String a = "abccc";
        int k = 1;
        HashMap<Character, Integer> d = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            if (d.containsKey(a.charAt(i))) {

                int b = d.get(a.charAt(i));
                d.put(a.charAt(i), b + 1);
            } else
                d.put(a.charAt(i), 1);
        }

        Queue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());

        for (int o : d.values()) {
            q.offer(o);
        }

        while (k != 0) {
            int m = q.poll();
            m = m - 1;
            q.offer(m);
            k--;
        }

        int ans = 0;

        while (!q.isEmpty()) {
            int c = q.poll();
            ans += c * c;
        }

        System.out.println(ans);
    }
}