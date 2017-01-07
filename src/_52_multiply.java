/**
 * Created by hezs1 on 2017/1/8.
 */
public class _52_multiply {

    /*
    时间复杂度为O(n^2)的解法
    public int[] multiply(int[] A) {
        int len=A.length;
        int[] B=new int[len];
        int i=0;
        while (i!=len){
            int temp=1;
            for (int j=0;j<len;j++){
                if (j==i)
                    continue;;
                temp*=A[j];
            }
            B[i]=temp;
            i++;
        }
        return B;
    }
    */
    //用三个数组分别来储存
    public int[] multiply(int[] A){
        int len=A.length;
        int[] b1=new int[len];  //保存前半部分的积
        int[] b2=new int[len];  //保存后半部分的积
        int[] B=new int[len];   //储存新数组
        b1[0]=1;
        b2[len-1]=1;
        for (int i=1;i<len-1;i++){
            b1[i]=b1[i-1]*A[i-1];
        }
        for (int j=len-2;j>0;j++){
            b2[j]=b2[j+1]*A[j+1];
        }
        for (int k=1;k<len-1;k++){
            B[k]=b1[k]*b2[k];
        }
        B[0]=A[1]*b2[1];
        B[len-1]=A[len-2]*b1[len-3];
        return B;
    }
}
