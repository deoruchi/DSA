package Tree;

import Recursionfile.remove;
import java.util.*;

public class FlattenBinary extends createTree {
    public static void main(String[] args) {
        Node tree = create();

        flat(tree);

        traverse(tree);
    }

    static Node prev = null;

    static void flat(Node root) {
        if (root == null)
            return;

        // reverse preorder
        flat(root.right);
        flat(root.left);
        root.right = prev;
        root.left = null;
        prev = root;

    }
}
