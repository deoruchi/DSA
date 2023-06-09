package Tree;

public class CountNode extends createTree {

    // Write a function to count the number of nodes in a binary tree.

    public static int count(Node r) {
        if (r == null) {
            return 1;
        }
        int a = count(r.left);
        int b = count(r.right);
        return a + b;

    }
    // Implement a function to calculate the height of a binary tree.

    public static int height(Node t) {
        if (t == null) {

            return 0;
        }

        int s = height(t.left);
        int c = height(t.right);
        return Math.max(s, c) + 1;
    }

    //

    public static void main(String[] args) {
        Node root = create();

        int c = count(root);
        System.out.println("the number od the node" + c);
        int x = height(root);
        System.out.println("the height of the node" + c);

    }
}
