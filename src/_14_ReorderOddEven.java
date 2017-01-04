

/**
 * Created by hezs1 on 2017/1/4.
 */

/*
输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分
当考虑这种情况时：保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class _14_ReorderOddEven {
    //利用两个字符串分别存储奇数和偶数
    public void reOrderArray(int [] array) {
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        for(int i=0;i<array.length;i++){
            if((array[i]&1)==1)
                s1.append(array[i]);
            else
                s2.append(array[i]);
        }
        String s=s1.append(s2).toString();
        char[] str=s.toCharArray();
        for(int i=0;i<s.length();i++){
            array[i]=str[i]-48;
        }
        //顺序查找，每次见偶数放到最后一位
        /*
        if(array.length==0)

            return;
        int temp=0;
        for(int i=0;i<array.length-i;i++){       //注意的for循环的终止条件
            if((array[i]&1)==0){
                temp=array[i];
                for (int j=i;j<array.length-1;j++){
                    array[j]=array[j+1];
                }
                array[array.length-1]=temp;
            }
        }
         */
    }


    //利用两个指针分别从头尾开始，交换奇偶顺序
    /*
      public void reOrderArray(int [] array) {
        if(array.length==0)
            return;
        int head=0;
        int tail=array.length-1;
        int temp=0;
        while(head<tail){
            while(head<tail&&(array[head]&1)!=0){
                head++;
            }
            while(head<tail&&(array[tail]&1)==0){
                tail--;
            }
            if(head<tail) {
                temp = array[head];
                array[head] = array[tail];
                array[tail] = temp;
            }
        }
    }
     */



}
