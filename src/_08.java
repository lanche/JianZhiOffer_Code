/**
 * Created by hezs1 on 2017/1/3.
 */
/*
题目描述
把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class _08 {
    public int minNumberInRotateArray(int [] array) {
        if (array.length==0)
            return 0;
        int index1=0,index2=array.length-1;
        int indexMid=index1;
        while(array[index1]>=array[index2]){
            if(index2-index1==1){
                indexMid=index2;
                break;
            }
            indexMid=(index1+index2)/2;
            if(array[index1]==array[index2]&&array[indexMid]==array[index1])
                return getMin(array,index2);        //当中间的数和首尾两数都相等时使用遍历的方法
            if(array[index1]<=array[indexMid])
                index1=indexMid;
            else if(array[index2]>=array[indexMid])
                index2=indexMid;
        }
        return array[indexMid];
    }
    //遍历方法的实现
    int getMin(int [] array,int index2){
        int result=array[0];
        for(int i=0;array[i]<=array[i+1]&&i<index2-1;i++){
            if(array[i]>array[i+1])
                result=array[i+1];
            break;
        }
        return result;
    }
}
