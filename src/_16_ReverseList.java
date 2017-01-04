/**
 * Created by hezs1 on 2017/1/4.
 */
/*
输入一个链表，反转链表后，输出链表的所有元素。
 */
public class _16_ReverseList {
    public ListNode ReverseList(ListNode head) {
        if(head==null)
            return null;
        ListNode reHead=null;
        ListNode nextNode=null;
        ListNode preNode=null;
        ListNode pNode=head;
        while(pNode!=null){
            nextNode=pNode.next;        //保存下一个节点
            if(nextNode==null)
                reHead=pNode;
            pNode.next=preNode;
            preNode=pNode;
            pNode=nextNode;
        }
        return reHead;
    }
}
