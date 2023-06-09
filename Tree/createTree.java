package Tree;

import java.util.*;

class Node {
    int data;
    Node right;
    Node left;

    public Node(int data) {
        this.data = data;
        this.right = null;// right
        this.left = null;// left
    }

}

public class createTree {

    public static Node create() {
        Scanner sc = new Scanner(System.in);
        int data;
        Node root = null;
        System.out.print("Enter the value");
        data = sc.nextInt();

        if (data < 0) {
            return null;
        } // -ve number returns the loop

        root = new Node(data);

        System.out.println("enter the right value");
        root.right = create();
        System.out.println("now enter the left value");
        root.left = create();

        return root;

    }

    // traverse inorder

    public static void traverse(Node root) {
        if (root == null)
            return;
        traverse(root.left);
        System.out.println(root.data);
        traverse(root.right);
        System.out.println(" ");
    }

    // travers postOrder

    public static void travers(Node root) {
        if (root == null) {
            return;
        }

        travers(root.left);
        travers(root.right);
        System.out.println(root.data);

    }

    // travers preeOrder
    public static void travers3(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        travers(root.left);
        travers(root.right);

    }

    public static void main(String[] args) {
        Node tree = create();
        traverse(tree);// inorder
        travers3(tree);// pre
        travers(tree);// post
    }
}
