/**
 * Created by hezs1 on 2017/1/7.
 */
/*
输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的
结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 */
//递归问题，好好琢磨
public class _39_TreeDepth {
    public int TreeDepth(TreeNode root) {
        if (root==null)
            return 0;
        int  left=TreeDepth(root.left);
        int  right=TreeDepth(root.right);

        return (left>right)?(left+1):(right+1);
    }
}
