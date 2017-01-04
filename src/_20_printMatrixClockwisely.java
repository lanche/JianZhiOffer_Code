import java.util.ArrayList;

/**
 * Created by hezs1 on 2017/1/5.
 */
/*
输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下矩阵：
 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */

//转圈转的宝宝要晕了啊+_+
public class _20_printMatrixClockwisely {
    ArrayList<Integer> list=new ArrayList<>();
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int columns=matrix[0].length;  //数组的列数
        int rows=matrix.length;   //数组的行数
        int start=0;
        while(columns>start*2&&rows>start*2){
            printMatrixInCircle(matrix,columns,rows,start); //转圈打印
            start++;
        }
        return list;
    }
    private void printMatrixInCircle(int [][] matrix,int columns,int rows,int start){
        int endX=columns-1-start;
        int endY=rows-1-start;

        //从左到右打印
        for(int i=start;i<=endX;++i){
            list.add(matrix[start][i]);
        }
        //从上到下打印
        if(start<endY){
            for(int i=start+1;i<=endY;++i){
                list.add(matrix[i][endX]);
            }
        }
        //从右到左打印
        if(start<endX&&start<endY){
            for(int i=endX-1;i>=start;--i){
                list.add(matrix[endY][i]);
            }
        }
        //从下到上打印
        if(start<endX&&start<endY-1){
            for(int i=endY-1;i>=start+1;--i){
                list.add(matrix[i][start]);
            }
        }
    }
}
