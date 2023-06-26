package Tree;

import java.util.ArrayList;
import java.util.HashMap;

public class findmode extends createTree {
    public static void main(String[] args) {
        // Find Mode in Binary Search Tree

        // Given the root of a binary search tree (BST) with duplicates, return all the
        // mode(s) (i.e., the most frequently occurred element) in it.

        // If the tree has more than one mode, return them in any order.

        // Assume a BST is defined as follows:

        // The left subtree of a node contains only nodes with keys less than or equal
        // to the node's key.
        // The right subtree of a node contains only nodes with keys greater than or
        // equal to the node's key.
        // Both the left and right subtrees must also be binary search trees.

        Node tree = create();
        ArrayList<Integer> list = new ArrayList<>();
        findmode(tree, list);
    }

    private static void findmode(Node root, ArrayList<Integer> list) {
        HashMap<Integer, Integer> set = new HashMap<>();
        getnodes(root, set);

        int maximum = -1;

        for (int key : set.keySet()) {
            int freq = set.get(key);

            if (maximum < freq) {
                maximum = freq;
                list.clear();
                list.add(key);
                continue;
            }
            if (maximum == freq)
                list.add(key);
        }

    }

    private static void getnodes(Node t, HashMap<Integer, Integer> set) {
        if (t == null)
            return;

        if (set.containsKey(t.data)) {
            set.put(t.data, set.get(t.data) + 1);
        } else {
            set.put(t.data, 1);
        }

        getnodes(t.left, set);
        getnodes(t.right, set);
    }
}
