package Tree;

import java.util.function.IntFunction;

public class MAxMin extends createTree {
    public static void main(String[] args) {
        Node tree = create();
        System.out.println(Minin(tree));
        System.out.println(findMax(tree));
    }

    static int Minin(Node a) {
        if (a == null)
            return Integer.MAX_VALUE;
        int n = a.data;
        int aa = Minin(a.left);
        int b = Minin(a.right);

        return Math.min(Math.min(aa, b), n);
    }

    public static int findMax(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;

        int n = root.data;

        int a = findMax(root.left);
        int b = findMax(root.right);

        return Math.max(Math.max(a, b), n);
    }

}
