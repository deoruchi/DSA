package Tree;

import java.util.*;

class Binarytoslist extends createTree {

    // Create a sorted linked list from the given Binary Tree
    // Given a binary tree, the task is to convert it into a sorted linked list.
    // Input:
    // 1
    // / \
    // 2 3
    // Output: 1 2 3

    // Input:
    // 2
    // / \
    // 4 8
    // / \ / \
    // 7 3 5 1
    // Output: 1 2 3 4 5 7 8

    // Input:
    // 3
    // /
    // 4
    // /
    // 1
    // /
    // 9
    // Output: 1 3 4 9
    public static void main(String[] args) {
        Node root = create();
        ArrayList<Integer> list = new ArrayList<>();

        convertslist(root, list);

        System.out.println(list);
        Collections.sort(list);

        LinkedList<Integer> list2 = new LinkedList<>(list);
        System.out.println(list2);
    }

    private static void convertslist(Node root, ArrayList<Integer> l) {
        if (root == null)
            return;

        convertslist(root.right, l);
        l.add(root.data);
        convertslist(root.left, l);

    }

}