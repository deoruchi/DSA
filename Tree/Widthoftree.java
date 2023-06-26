package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Widthoftree extends createTree {
    // Maximum Width of Binary Tree

    // Given the root of a binary tree, return the maximum width of the given tree.

    // The maximum width of a tree is the maximum width among all levels.

    // The width of one level is defined as the length between the end-nodes (the
    // leftmost and rightmost non-null nodes), where the null nodes between the
    // end-nodes that would be present in a complete binary tree extending down to
    // that level are also counted into the length calculation.
    public static void main(String[] args) {
        Node tree = create();

        System.out.println(findwidth(tree));

    }

    private static int findwidth(Node root) {

        Queue<Node> n = new LinkedList<>();
        Queue<Integer> num = new LinkedList<>();

        n.offer(root);
        num.offer(1);

        int width = 0;

        while (!n.isEmpty()) {
            int l = n.size();

            int left = 0;
            int right = 0;

            for (int i = 0; i < l; i++) {
                Node curr = n.poll();
                int curval = num.poll();

                if (i == 0)
                    left = curval;

                if (i == l - 1)
                    right = curval;

                if (curr.left != null) {
                    n.offer(curr.left);
                    num.offer(curval * 2);
                }

                if (curr.right != null) {
                    n.offer(curr.right);
                    num.offer(curval * 2 + 1);
                }

            }

            width = Math.max(width, right - left + 1);

        }

        return width;
    }

}
