package Tree;

import java.util.*;

public class Inorderiterate extends createTree {
    public static void main(String[] args) {
        Node tree = create();
        inorder(tree);
    }

    private static void inorder(Node tree) {

        Stack<Node> d = new Stack<>();
        Node curr = tree;

        while (d.size() > 0 || !d.isEmpty()) {
            if (curr != null) {
                d.push(curr);
                curr = curr.left;
            }

            curr = d.pop();
            System.out.print(curr.data);
            curr = curr.right;
        }

    }

}
