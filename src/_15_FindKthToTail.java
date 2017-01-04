/**
 * Created by hezs1 on 2017/1/4.
 */
//输入一个链表，输出该链表中倒数第k个结点。
    //考察代码的鲁棒性
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class _15_FindKthToTail {

    //利用一前一后两个指针，只需要遍历一次

    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null||k==0)
            return null;
        ListNode firstNode=head;
        ListNode secondNode=head;
        for(int i=0;i<k-1;i++){
            if(firstNode.next!=null)
                firstNode=firstNode.next;
            else return null;
        }
        while (firstNode.next!=null){
            firstNode=firstNode.next;
            secondNode=secondNode.next;
        }
            return secondNode;
    }

/* 遍历两次，第一次计数 ，第二次遍历到n-k+1个点
    public ListNode FindKthToTail(ListNode head,int k){
        if(head==null||k==0)
            return null;
        int count=1;
        ListNode countNode=head;
        ListNode searchNode=head;
        while(countNode.next!=null){
            countNode=countNode.next;
            count++;
        }
        if(count<k)
            return null;
        else {
            for(int i=0;i<count-k;i++){
                searchNode=searchNode.next;
            }
        }
        return searchNode;
    }
    */
}
