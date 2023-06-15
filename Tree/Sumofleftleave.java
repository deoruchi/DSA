package Tree;

public class Sumofleftleave extends createTree {
    // Sum of Left Leaves

    // Given the root of a binary tree, return the sum of all left leaves.

    // A leaf is a node with no children. A left leaf is a leaf that is the left
    // child of another node.
    public static void main(String[] args) {
        Node root = create();

        System.out.println(sum(root));
    }

    static int sum = 0;

    private static int sum(Node root) {
        if (root == null)
            return 0;
        if (root.left != null && root.left.left == null && root.left.right == null)
            sum += root.left.data;
        sum(root.left);
        sum(root.right);
        return sum;
    }
}
