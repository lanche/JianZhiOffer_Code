/**
 * Created by hezs1 on 2017/1/5.
 */
/*
输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,
否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class _24_VerfifySequenceOfBST {

    //递归版本
   /*
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence.length == 0)
            return false;
        if (sequence.length == 1)
            return true;
        return judge(sequence, 0.sequence.length - 1);
    }

    boolean judge(int[] sequence, int start, int root) {
        if (start >= root)
            return true;
        int i = root;
        while (i > start && sequence[i - 1] > sequence[root]) {      //从后面开始查找大于根节点的数
            i--;
        }
        for (int j = start; j < i - 1; j++) {                     //  从前面开始找小于根节点的部分
            if (sequence[j] > sequence[root])
                return false;
        }
        return judge(sequence, start, i - 1) && judge(sequence, i, root - 1);
    }
*/

// 下面介绍一个牛逼的非递归方法，方法来自牛客网的一位大神， 膜拜
    //不过大神有个地方出错了，改正后ok了
public boolean VerifySquenceOfBST(int[] sequence){
    int len=sequence.length;
    if(len==0)
        return false;
    int i=0;
    while(--len>0){
        while (sequence[i++]<sequence[len]){
            i++;
        }
        while (sequence[i++]>sequence[len]){
            i++;
        }
        if(i<len)
            return false;
        i=0;
    }
    return true;
}
}