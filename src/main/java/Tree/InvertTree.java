package Tree;

import common.TreeNode;

/**
 * 翻转一棵二叉树。
 *
 * 示例：
 *
 * 输入：
 *
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * 输出：
 *
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 *

 */
public class InvertTree {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        TreeNode second1 = new TreeNode(2);
        TreeNode second2 = new TreeNode(3);
        TreeNode third1 = new TreeNode(5);
        root1.left = second2;
        root1.right =second1;
        second1.left =third1;
        System.out.println("------");
       TreeNode invertRoot =   invertTree(root1);
        System.out.println(invertRoot);

    }

    /**
     * 递归
     *
     * 这是一道很经典的二叉树问题。显然，我们从根节点开始，递归地对树进行遍历，
     * 并从叶子结点先开始翻转。如果当前遍历到的节点 root 的左右两棵子树都已经翻转，那么我们只需要交换两棵子树的位置，
     * 即可完成以 root 为根节点的整棵子树的翻转。
     *
     * @param root
     * @return
     */
    public  static TreeNode invertTree(TreeNode root) {

        if( root == null){
            return null;
        }

        TreeNode right =  invertTree(root.right);
        TreeNode left  =  invertTree(root.left);

        root.left = right;
        root.right = left;
        return root;

    }
}
