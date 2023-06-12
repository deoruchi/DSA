package Tree;

import Recursionfile.remove;

public class subTree extends SameTree {
    public static void main(String[] args) {
        Node tree = create();
        Node subtree = create();

        if (isSubtree(tree, subtree))
            System.out.println("true");
        System.out.println("false");

    }

    static boolean isSubtree(Node n1, Node n2) {
        if (n2 == null)
            return true;
        // null subtree is a subtree for main tree
        if (n1 == null)
            return false;

        if (isSameTree(n1, n2))
            return true;

        return isSubtree(n1.left, n2) || isSameTree(n1.right, n2);

    }

    // another approach is that use preorder and inorer
    // for noth the tree
    // check the substring matched true either way false

}
