package Tree;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class CompleteBInary extends createTree {
    // Check Completeness of a Binary Tree

    // Given the root of a binary tree, determine if it is a complete binary tree.

    // In a complete binary tree, every level, except possibly the last, is
    // completely filled, and all nodes in the last level are as far left as
    // possible. It can have between 1 and 2h nodes inclusive at the last level h.

    public static void main(String[] args) {
        Node tree = create();
        complete(tree);
    }

    private static void complete(Node root) {
        Queue<Node> q = new LinkedList<>();

        q.offer(root);

        while (!q.isEmpty()) {
            Node curr = q.poll();

            if (curr != null) {
                q.offer(curr.left);
                q.offer(curr.right);
            } else {
                while (!q.isEmpty()) {
                    if (q.poll() != null)
                        System.out.println("Not a complete Binary Tree");
                }
            }
        }
        System.out.println("Complete BInary tree");
    }

}
