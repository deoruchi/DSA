package Tree;

import javax.swing.text.AbstractDocument.LeafElement;

public class Diameter extends CountNode {
    // Diameter of Binary Tree

    // Given the root of a binary tree, return the length of the diameter of the
    // tree.

    // The diameter of a binary tree is the length of the longest path between any
    // two nodes in a tree. This path may or may not pass through the root.

    // The length of a path between two nodes is represented by the number of edges
    // between them.
    public static void main(String[] args) {
        Node tree = create();

        System.out.println(dia(tree));
    }

    private static int dia(Node tree) {
        if (tree == null)
            return 0;
        // here we are calculating diameter via nodes
        int a = 1 + height(tree.left) + height(tree.left);
        // for path
        // int a = height(tree.left) + height(tree.left);

        int s = dia(tree.left);
        int d = dia(tree.right);

        return Math.max(a, Math.max(s, d));

    }

    // advance anwser
    static int ans = 0;

    public static int heightv2(Node t) {
        if (t == null) {

            return 0;
        }

        int s = height(t.left);
        int c = height(t.right);

        ans = Math.max(ans, (1 + s + c));
        return Math.max(s, c) + 1;
    }
}
