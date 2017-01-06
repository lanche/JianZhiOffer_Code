/**
 * Created by hezs1 on 2017/1/6.
 */
/*
把只包含因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，
因为它包含因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */
public class _34_getUglyNumber {

   /*
   此方法复杂度过大，运行超时作废。
    public int GetUglyNumber_Solution(int index) {
        if ((index<=5))
             return index;
        int count=5;
        int curNumber=6;
        while (count<index){
            if(isUglyNumber(curNumber))
                count++;
            curNumber++;
        }
        return curNumber-1;
    }
    private boolean isUglyNumber(int number){
        while (number%2==0){
            number/=2;
        }
        while (number%3==0){
            number/=3;
        }
        while (number%5==0){
            number/=5;
        }
        return number==1;
    }
    */
//这题有点难以理解，好好体会，多琢磨
    public int GetUglyNumber_Solution(int index){
        if (index<=0)
            return 0;
        int[] uglyNumbers =new int[index];
        uglyNumbers[0]=1;
        int nextUglyIndex=1;
        int mutiply2=0;
        int mutiply3=0;
        int mutiply5=0;
        while (nextUglyIndex<index){
            //找出下一个最小的丑数
            int min=Min(uglyNumbers[mutiply2]*2,uglyNumbers[mutiply3]*3,uglyNumbers[mutiply5]*5);
            uglyNumbers[nextUglyIndex]=min;
            //找到那个只要乘一次就是下一个丑数的丑数
            while (uglyNumbers[mutiply2]*2<=uglyNumbers[nextUglyIndex])
                ++mutiply2;
            while (uglyNumbers[mutiply3]*3<=uglyNumbers[nextUglyIndex])
                ++mutiply3;
            while (uglyNumbers[mutiply5]*5<=uglyNumbers[nextUglyIndex])
                ++mutiply5;
            nextUglyIndex++;
        }
        return uglyNumbers[nextUglyIndex-1];
    }
    private int Min(int mutiply2,int mutiply3,int mutiply5){
        int min=(mutiply2<mutiply3)?mutiply2:mutiply3;
        min=(min < mutiply5)?min:mutiply5;
        return min;
    }
}
