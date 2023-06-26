package Tree;

public class InsertNodeBST extends createTree {

    // Insert a node in a BST
    // Write a function to search for a specific value in a binary tree.
    public static void main(String[] args) {
        Node tree = create();
        int data = 8;
        inserNode(tree, data);
        travers(tree);
    }

    static void inserNode(Node root, int key) {

        if (root.data > key) {

            if (root.left == null) {
                root.left = new Node(key);
                return;
            }

            inserNode(root.left, key);
        }

        if (root.data < key) {
            if (root.right == null) {
                root.right = new Node(key);
                return;
            }
            inserNode(root.right, key);
        }

    }
}
