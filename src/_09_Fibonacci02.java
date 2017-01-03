/**
 * Created by hezs1 on 2017/1/3.
 */

/*
一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */

/*
问题分析：
因为n级台阶，第一步有n种跳法：跳1级、跳2级、到跳n级
跳1级，剩下n-1级，则剩下跳法是f(n-1)
跳2级，剩下n-2级，则剩下跳法是f(n-2)
所以f(n)=f(n-1)+f(n-2)+...+f(1)
因为f(n-1)=f(n-2)+f(n-3)+...+f(1)
所以f(n)=2*f(n-1)
 */
public class _09_Fibonacci02 {
    //非递归的实现
    public int JumpFloorII(int target) {
        if(target==1) return 1;
        int result=1;
        while(target!=1){
            result*=2;
            target--;
        }
        return result;
    }

    /*递归实现
     public int JumpFloorII(int target) {
         if(target==1) return 1;
        return 2*JumpFloorII(target-1);
    }
     */

    /*
    //更快的方法，利用位运算
     public int JumpFloorII(int target) {
        return 1<<(target-1);
    }
     */
}
