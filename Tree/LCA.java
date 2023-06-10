package Tree;

public class LCA extends createTree {
    // Lowest Common Ancestor in a Binary Tree
    // The lowest common ancestor is the lowest node in the tree that has both n1
    // and n2 as descendants, where n1 and n2 are the nodes for which we wish to
    // find the LCA. Hence, the LCA of a binary tree with nodes n1 and n2 is the
    // shared ancestor of n1 and n2 that is located farthest from the root.

    private static int data;

    public static void main(String[] args) {
        Node tree = create();
        int n1 = 2;
        int n2 = 4;
        findlca(tree, n1, n2);

    }

    // idea is
    // current element is a or b
    // a is on left sub tree b on right sub treee or vice versa that we are
    // searching
    // both a nad b are on same sub tree
    // or both a and b are not present

    static Node findlca(Node root, int a, int b) {
        if (root == null)
            return null;

        if (root.data == a || root.data == b)
            return root;

        Node left = findlca(root.left, a, b);
        Node right = findlca(root.right, a, b);

        if (left == null)
            return right;
        if (right == null)
            return left;

        return root;
    }
}
