/**
 * Created by hezs1 on 2017/1/3.
 */
/*
大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 */

public class _9 {
    //非递归的方式
    public int Fibonacci(int n) {
        int result[]={0,1};
        if(n<=1)
            return result[n];
        int first=0;
        int second=1;
        int follow=0;
        for(int i=2;i<=n;i++){
            follow=first+second;
            first=second;
            second=follow;
        }
        return follow;
    }

    /* 递归的方式实现
    public int Fibonacci(int n) {
        if(n<=0)
            return 0;
        if(n==1)
            return 1;
        return Fibonacci(n-1)+Fibonacci(n-2);
        }
        */
}


