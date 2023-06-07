package Tree;

import java.util.*;

class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;// right
        this.prev = null;// left
    }
}

public class createTree {

    static Node create() {
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
        root.next = create();
        System.out.println("now enter the left value");
        root.prev = create();

        return root;

    }

    // traverse inorder

    static void traverse(Node root) {
        if (root == null)
            return;
        traverse(root.prev);
        System.out.println(root.data);
        traverse(root.next);
        System.out.println(" ");
    }

    // travers postOrder

    static void travers(Node root) {
        if (root == null) {
            return;
        }

        travers(root.prev);
        travers(root.next);
        System.out.println(root.data);

    }

    // travers preeOrder
    static void travers3(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        travers(root.prev);
        travers(root.next);

    }

    public static void main(String[] args) {
        Node tree = create();
        traverse(tree);// inorder
        travers3(tree);// pre
        travers(tree);// post
    }
}
