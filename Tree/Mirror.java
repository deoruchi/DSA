package Tree;

public class Mirror extends createTree {
    // Convert a Binary Tree into its Mirror Tree
    // Given a binary tree, the task is to convert the binary tree into its Mirror
    // tree. Mirror of a Binary Tree T is another Binary Tree M(T) with left and
    // right children of all non-leaf nodes interchanged.

    public static void main(String[] args) {
        Node tree = create();

        mirror(tree);
        travers(tree);
    }

    private static void mirror(Node node) {
        if (node == null)
            return;

        mirror(node.left);
        mirror(node.right);

        Node temp = node.right;
        node.right = node.left;
        node.left = temp;

    }
}
