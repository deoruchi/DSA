package Tree;

import javax.naming.spi.DirStateFactory.Result;

public class BalancedBinary extends createTree {
    static boolean result = true;

    private static int isBalanced(Node a) {
        if (a == null)
            return 0;
        int aa = isBalanced(a.left);

        int bb = isBalanced(a.right);

        if (Math.abs(aa - bb) > 1)
            result = false;

        return Math.max(aa, bb) + 1;
    }

    public static void main(String[] args) {
        Node a = create();

        isBalanced(a);

        if (result == false)
            System.out.println("no balanced");
        else
            System.out.println("balanced");
    }

}
