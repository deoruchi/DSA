package Tree;

public class CheckBST extends createTree {
    // Validate Binary Search Tree
    // Given the root of a binary tree, determine if it is a valid binary search
    // tree (BST).

    // A valid BST is defined as follows:

    // The left
    // subtree
    // of a node contains only nodes with keys less than the node's key.
    // The right subtree of a node contains only nodes with keys greater than the
    // node's key.
    // Both the left and right subtrees must also be binary search trees.

    public static void main(String[] args) {
        Node tree = create();
        if (isBst(tree, Integer.MAX_VALUE, Integer.MIN_VALUE))
            System.out.println("Balanced");
        System.out.println("Unbalanced");
    }

    // idea:: using range to check the bst
    // if the node is in given range then its ok
    // other wise not

    private static boolean isBst(Node root, int max, int min) {
        if (root == null)
            return true;

        if (root.data >= max || root.data <= min)
            return false;

        return isBst(root.left, root.data, min) && isBst(root.right, max, root.data);
        // left side will be smaller than the prev
        // right side will always be greater than prev
    }
}
