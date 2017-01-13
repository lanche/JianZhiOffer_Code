/**
 * Created by hezs1 on 2017/1/13.
 */
/*

一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。

 */
//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
//解题思路是根据某位是否为1将一个数组划分成两个数组，其中一个不重复的数组必定在一个数组，另一个在另外一个数组。
public class _40_FindNumbersAppearOnce {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if (array==null || array.length<2)
            return;
        int result = 0;
        for (int i=0;i<array.length;i++)
            result^=array[i];
        int indexOf1 = FindFirstBitIs1(result);
        num1[0]=0;num2[0]=0;
        for (int j=0;j<array.length;j++){
            if(isBit1(array[j],indexOf1))           //特定位为1的数做亦或运算
                num1[0]^=array[j];
            else
                num2[0]^=array[j];                  //特定位为0的数做亦或运算
        }
    }
    private int FindFirstBitIs1(int num){           //找到到从左往右数第一个数字为1的位
        int cur=0;
        while ((num&1)==0){
            cur++;
            num>>=1;
        }
        return cur;
    }
    private boolean isBit1(int num,int indexOf1){           //判断在第一个为1的位该数字是否为1
        num>>=indexOf1;
        if ((num&1)==1)
            return true;
        else
            return false;
    }

    /*
    佩服别人的简洁的代码

     public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array.length < 2) return ;
        int myxor = 0;
        int flag = 1;
        for(int i = 0 ; i < array.length; ++ i )
            myxor ^= array[i];
        while((myxor & flag)== 0) flag <<= 1;
       // num1[0] = myxor;
        //num2[0] = myxor;
        for(int i = 0; i < array.length; ++ i ){
            if((flag & array[i])== 0) num2[0]^= array[i];
            else num1[0]^= array[i];
        }
    }
     */
}
