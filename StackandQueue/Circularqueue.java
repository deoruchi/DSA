import Recursionfile.remove;

class MyCircularQueue {
    Node root;
    Node head;
    Node tail;
    int count;
    int k;

    public MyCircularQueue(int k) {
        root = new Node(-1);
        head = root;
        tail = root;
        count = 0;
        this.k = k;
    }

    public boolean enQueue(int value) {
        if (count == k)
            return false;
        Node cur = new Node(value);
        if (count == 0) {
            head = cur;
        }
        count++;
        tail.next = cur;
        cur.prev = tail;
        tail = tail.next;
        return true;
    }

    public boolean deQueue() {
        if (count == 0)
            return false;
        head = head.next;
        count--;
        if (count == 0)
            head = root;
        else
            head.prev = null;
        return true;
    }

    public int Front() {
        if (count == 0)
            return -1;
        return head.val;
    }

    public int Rear() {
        if (count == 0)
            return -1;
        return tail.val;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == k;
    }
}

class Node {
    int val;
    Node prev;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class Circularqueue {
    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
        myCircularQueue.enQueue(1); // return True
        myCircularQueue.enQueue(2); // return True
        myCircularQueue.enQueue(3); // return True
        myCircularQueue.enQueue(4); // return False

        myCircularQueue.Rear(); // return 3
        myCircularQueue.isFull(); // return True
        myCircularQueue.deQueue(); // return True
        myCircularQueue.enQueue(4); // return True
        myCircularQueue.Rear();
    }
}
