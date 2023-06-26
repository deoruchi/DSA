package Tree;

public class FloorCeil extends createTree {
    // Floor and Ceil from a BST
    // Given a binary search tree and a key(node) value, find the floor and ceil
    // value for that particular key value.

    // Floor Value Node: Node with the greatest data lesser than or equal to the key
    // value.
    // Ceil Value Node: Node with the smallest data larger than or equal to the key
    // value.
    // 8
    // / \
    // 4 12
    // / \ / \
    // 2 6 10 14

    // Key: 11 Floor: 10 Ceil: 12
    // Key: 1 Floor: -1 Ceil: 2
    // Key: 6 Floor: 6 Ceil: 6
    // Key: 15 Floor: 14 Ceil: -1

    public static void main(String[] args) {
        Node root = create();

        fcvalue(root, 45);
    }

    static int floor;
    static int ceil;

    private static void fcvalue(Node root, int i) {
        floor = -1;
        ceil = -1;

        floorCeilBSTHelper(root, i);

        System.out.println(i + " " + floor + " " + ceil);
    }

    private static void floorCeilBSTHelper(Node root, int key) {
        while (root != null) {
            if (root.data == key) {
                ceil = root.data;
                floor = root.data;
                return;
            }

            if (key > root.data) {
                floor = root.data;
                root = root.right;
            } else {
                ceil = root.data;
                root = root.left;
            }
        }
        return;
    }
}
