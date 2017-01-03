/**
 * Created by hezs1 on 2017/1/3.
 */
/*
我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？

问题分析：依旧是斐波拉契数列的问题
 */
public class _09_RectCover {
    public int RectCover(int target) {
       /* int one=1;
        int two=2;
        int temp=0;
        if(target==1)
            return 1;
        if(target==2)
            return 2;
        for(int i=3;i<=target;i++){
            temp=one+two;
            one=two;
            two=temp;
        }
        return  temp;
        */
       if(target<1)
           return 0;
       if(target==1||target==2)
           return target;
        else return RectCover(target-1)+RectCover(target-2);
    }
}
