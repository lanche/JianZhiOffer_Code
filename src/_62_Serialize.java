/**
 * Created by hezs1 on 2017/1/9.
 */
//请实现两个函数，分别用来序列化和反序列化二叉树
public class _62_Serialize {

    int index = -1;
    String Serialize(TreeNode root) {
        StringBuilder stringBuilder =new StringBuilder();
        if (root==null){
            stringBuilder.append("#,");    //左右子节点为空时添加“#”
            return stringBuilder.toString();
        }
        stringBuilder.append(root.val+",");
        stringBuilder.append(Serialize(root.left));
        stringBuilder.append(Serialize(root.right));
        return stringBuilder.toString();
    }
    TreeNode Deserialize(String str) {
        index++;
        int len=str.length();
        if (index==len)
            return null;
        String[] strr = str.split(",");
        TreeNode node = null;
        if (!strr[index].equals("#")){
            node = new TreeNode(Integer.valueOf(strr[index]));
            node.left = Deserialize(str);
            node.right = Deserialize(str);
        }
        return node;
    }
}
