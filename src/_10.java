/**
 * Created by hezs1 on 2017/1/3.
 */
//二进制中1的个数 ：输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
public class _10 {
    public int NumberOf1(int n) {
        int count=0;
        while(n!=0){
            count++;
            n=n&(n-1);
        }
        return count;
    }
}
//考察位运算的技巧