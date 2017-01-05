/**
 * Created by hezs1 on 2017/1/5.
 */
import java.util.ArrayList;
public class _25_findPath {
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();


    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {

        if (root == null)
            return lists;
        int currentSum = 0;
        findPaths(root, target, list, currentSum);
        return lists;
    }

    private void findPaths(TreeNode root, int expectedSum, ArrayList<Integer> list, int currentSum) {
        currentSum += root.val;
        list.add(root.val);
        boolean isLeaf = root.left == null && root.right == null;
        if (currentSum == expectedSum && isLeaf) {
            lists.add(new ArrayList<>(list));      //我也不明白为什么对了，反正就是终于通过了
        } else {
            if (root.left != null)
                findPaths(root.left, expectedSum, list, currentSum);
            if (root.right != null)
                findPaths(root.right, expectedSum, list, currentSum);
        }
        list.remove(list.size() - 1);
    }


    /*
    下面的方法来自牛客网的一个答案
     虽然思路和上面的一样，但是很显然这个方法就厉害了
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target){
        if(root==null)
            return lists;
        list.add(root.val);
        target-=root.val;
        if(target==0&&root.left==null&&root.right==null)
            lists.add(new ArrayList<>(list));
        else {
            if (root.left!=null)
                FindPath(root.left,target);
            if (root.right!=null)
                FindPath(root.right,target);
        }
        list.remove(list.size()-1);
        return lists;
    }
    */
}
