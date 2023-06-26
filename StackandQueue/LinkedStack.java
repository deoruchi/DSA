
import java.util.Scanner;

class Node {
    public int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;

    }

    Node top = null;
}

public class LinkedStack {
    static Node top = null;
    static Scanner sc = new Scanner(System.in);

    static void push() {
        System.out.println("ENterr the data");
        int data = sc.nextInt();
        Node newNode = new Node(data);

        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top.next = newNode;
        }
    }

    static void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {

            System.out.print(top.data);
            top = top.next;

        }
    }

    static void display() {
        Node temp = top;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        int l;
        do {
            System.out.println("enter 1 to push , 2 to pop the items , 3 to display the stacked items");
            System.out.println("Enter the choice");

            int d = sc.nextInt();

            switch (d) {
                case 1:
                    push();
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    display();
                    break;
            }

            System.out.print("enter 0  to continue or enter any number to discontinue");
            l = sc.nextInt();

        } while (l == 0);

        System.out.println("Exit Succesfully");
    }

}
