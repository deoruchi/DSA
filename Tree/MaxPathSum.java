package Tree;

import javax.swing.tree.TreeNode;

public class MaxPathSum extends Sumofleftleave {
    static int answer;

    public static void main(String[] args) {
        Node tree = create();
        answer = Integer.MIN_VALUE;
        dfs(tree);
        System.out.print(answer);
    }

    public static int dfs(Node r) {
        if (r == null)
            return 0;

        int a = dfs(r.left);
        int b = dfs(r.right);

        answer = Math.max(answer, r.data + a + b);

        return Math.max(0, r.data + Math.max(a, b));
    }
}
