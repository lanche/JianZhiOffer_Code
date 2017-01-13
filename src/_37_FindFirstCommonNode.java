/**
 * Created by hezs1 on 2017/1/13.
 */
//输入两个链表，找出它们的第一个公共结点。
public class _37_FindFirstCommonNode {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int len1=getListLength(pHead1);                 //重复进行某个运算时最好单独建立一个方法
        int len2=getListLength(pHead2);
        int distance;
        ListNode longList ,shortList ;
        if (len1>=len2){                            // 判断哪个是最长的链表
            distance = len1-len2;
            longList = pHead1;
            shortList = pHead2;
        }
        else {
            distance = len2-len1;
            longList = pHead2;
            shortList = pHead1;
        }
        for (int i=0;i<distance;i++){               // 长链表先走长出来的那部分距离
            longList=longList.next;
        }
        while (shortList!=null&&longList!=null&&shortList!=longList){           //当两个节点相等时即为公共节点
            shortList=shortList.next;
            longList=longList.next;
        }
        return longList;
    }
    private int getListLength(ListNode root){
        if (root==null)
            return 0;
        int length=0;
        while (root!=null){
            length++;
            root=root.next;
        }
        return length;
    }
}
