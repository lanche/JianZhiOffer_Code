import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by hezs1 on 2017/1/5.
 */

//从上往下打印出二叉树的每个节点，同层节点从左至右打印。（层序遍历）

//结合“Z”形打印,对比这两种方式  一个利用栈，一个利用队列的性质
public class _23_printFromTopToBottom {
    ArrayList<Integer> list =new ArrayList<>();
    LinkedList<TreeNode> nodeList =new LinkedList<>();
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if(root==null)
            return null;
        nodeList.add(root);
        while (!nodeList.isEmpty()){            //循环条件啊，弄得我好辛苦不知道为什么错了啊
            TreeNode pNode=nodeList.pop();
            list.add(pNode.val);
            if(pNode.left!=null)
                nodeList.add(pNode.left);
            if(pNode.right!=null)
                nodeList.add(pNode.right);
        }
        return list;
    }

}
