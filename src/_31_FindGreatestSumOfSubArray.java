/**
 * Created by hezs1 on 2017/1/6.
 */
/*
HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。今天测试组开完会后,他又发话了:在古老的一维模式识别中
,常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。但是,如果向量中包含负数,是否应该
包含某个负数,并期望旁边的正数会弥补它呢？例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开
始,到第3个为止)。你会不会被他忽悠住？(子向量的长度至少是1)
 */
public class _31_FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
     /*   if(array.length==0)
            return 0;
        int CurSum=array[0];
        int GreatestSum=array[0];               //假设最大值和初始值为数组的第一个数
        for (int i=1;i<array.length;i++){       //q千万别冲第一个开始加（即i=0），不然第一个数会被加两次。
            if(CurSum <=0)
                CurSum=array[i];
            else
                CurSum+=array[i];
            if(CurSum>=GreatestSum)
                GreatestSum=CurSum;
        }
        return GreatestSum;
        */


     //一种风骚的写法

        int curSum=array[0];
        int greatestSum=array[0];
        for(int i=1;i<array.length;i++){
            curSum=(curSum<=0)?array[i]:curSum+array[i];
            greatestSum=(curSum>=greatestSum)?curSum:greatestSum;
        }
    return greatestSum;
}
}
