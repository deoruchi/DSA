import java.util.Stack;

public class Deletemiddle {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(12);
        s.push(6);
        s.push(8);
        s.push(9);
        s.push(9);
        s.push(5);
        s.push(11);
        s.push(5);
        s.push(5);
        s.push(9);
        s.push(6);
        s.push(11);

        // s.push(1);
        // s.push(2);
        // s.push(3);
        // s.push(4);
        // s.push(5);

        int pos = (int) Math.ceil((s.size() + 1) / 2.0);

        // int arr[] = new int[pos];
        // int i = 0;

        // while (pos != 0) {
        // arr[i] = s.pop();
        // pos--;
        // i++;
        // }

        // for (int j = arr.length - 2; j >= 0; j--) {
        // System.out.println(arr[j]);
        // s.push(arr[j]);
        // }

        // deletethenumber(pos, s);

        Stack<Integer> io = new Stack<>();

        while (pos != 1) {
            System.out.println(s.peek());
            io.push(s.peek());
            s.pop();
            pos--;
        }
        s.pop();

        while (!io.isEmpty()) {

            s.push(io.peek());
            io.pop();
        }

        System.out.print(s);
    }

    static void deletethenumber(int pos, Stack<Integer> s) {

        if (pos == 0) {
            s.pop();
            return;
        }

        int t = s.peek();
        s.pop();
        deletethenumber(pos - 1, s);
        s.push(t);

    }
}
