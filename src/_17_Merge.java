/**
 * Created by hezs1 on 2017/1/4.
 */
public class _17_Merge {
    //递归版的，递归好难理解啊，呜呜呜~
    /*
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode mergeList=null;
        if(list1==null)
            return list2;
         else if(list2==null)
            return list1;
        if(list1.val<list2.val){
            mergeList=list1;
            mergeList.next=Merge(list1.next,list2);
        }
        else {
            mergeList=list2;
            mergeList.next=Merge(list1,list2.next);
        }
        return mergeList;
    }
    */
//非递归版的 ，养成if else带括号的习惯啊，不知怎么的刚才没带括号过不了啊
    public ListNode Merge(ListNode list1,ListNode list2){
        if(list1==null) {
            return list2;
        }
        if(list2==null)
            return list1;
        ListNode MergeHead=null;
        ListNode MergeList=null;
        while(list1!=null&&list2!=null){
            if(list1.val<=list2.val){
                if(MergeHead==null){
                    MergeHead=MergeList=list1;
                }
             else {
                    MergeList.next = list1;
                    MergeList = MergeList.next;
                }
                    list1 = list1.next;
            }
            else {
                if(MergeHead==null) {
                    MergeHead = MergeList = list2;
                }
                else {
                    MergeList.next = list2;
                    MergeList = MergeList.next;
                }
                list2=list2.next;
            }
        }
        if(list1==null)
            MergeList.next=list2;
        else
            MergeList.next=list1;
        return MergeHead;
    }
}
