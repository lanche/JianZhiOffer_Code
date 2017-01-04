import java.util.Stack;

/**
 * Created by hezs1 on 2017/1/5.
 */
/*
操作给定的二叉树，将其变换为源二叉树的镜像。
输入描述:
二叉树的镜像定义：源二叉树
    	    8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7 9 11
    	镜像二叉树
    	    8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9 7  5
 */


public class _19_mirrorTree {
    //递归实现
   /*public void Mirror(TreeNode root) {
        if(root==null)
            return;
        if(root.left==null&&root.right==null)
            return;
        TreeNode tempNode=root.left;
        root.left=root.right;
        root.right=tempNode;
        if(root.left!=null)
             Mirror(root.left);     //什么时候需要return什么时候不需要要明白
        if(root.right!=null)
            Mirror(root.right);
    }
    */

   //非递归实现
   public void Mirror(TreeNode root){
       if (root==null)
           return;
       Stack<TreeNode> stack=new Stack();
       stack.push(root);
       while (!stack.empty()){
           TreeNode tempNode=stack.pop();
           if(tempNode.left!=null||tempNode.right!=null) {
                TreeNode temp=tempNode.left;
               tempNode.left = tempNode.right;
               tempNode.right = temp;
           }
           if (tempNode.right!=null) {
              stack.push(tempNode.right);
           }
           if(tempNode.left!=null)
               stack.push(tempNode.left);
       }
   }

}
