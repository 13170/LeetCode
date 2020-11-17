package Tree;

import common.TreeNode;

/**
 * 二叉树最大深度  递归 DFS
 */
public class MaxDepth {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        TreeNode second1 = new TreeNode(2);
        TreeNode second2 = new TreeNode(3);
        TreeNode third1 = new TreeNode(5);
        root1.left = second2;
        root1.right =second1;
        second1.left =third1;

        System.out.println(maxDepth(root1));
    }

    /**
     *思路与算法
     *
     * 如果我们知道了左子树和右子树的最大深度 l和 r，那么该二叉树的最大深度即为
     *
     * max(l,r)+1
     *
     * 而左子树和右子树的最大深度又可以以同样的方式进行计算。因此我们在计算当前二叉树的最大深度时，
     * 可以先递归计算出其左子树和右子树的最大深度，然后在 O(1) 时间内计算出当前二叉树的最大深度。递归在访问到空节点时退出。
     *
     *
     * @param root
     * @return
     */
    private static int maxDepth(TreeNode root){

        if (root == null){
            return 0;
        }
        int maxLetfDepth= maxDepth(root.left);
        int maxRightDepth = maxDepth(root.right);

        return Math.max(maxLetfDepth,maxRightDepth)+1;

    }
}
