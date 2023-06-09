package Tree;

public class SameTree extends createTree {
    public static void main(String[] args) {
        Node p = create();
        Node q = create();
        isSameTree(p, q);
    }

    public static boolean isSameTree(Node p, Node q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;

        if (p.data == q.data)
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

        return false;
    }
}
