/**
 * Created by hezs1 on 2017/1/3.
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
                return getMin(array,index2);
            if(array[index1]<=array[indexMid])
                index1=indexMid;
            else if(array[index2]>=array[indexMid])
                index2=indexMid;
        }
        return array[indexMid];
    }
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
