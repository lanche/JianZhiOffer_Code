import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by hezs1 on 2017/1/6.
 **/
/*
输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小
的一个。例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 */
public class _33_PrintMinNumber {
    public String PrintMinNumber(int [] numbers) {
        if (numbers.length==0)
            return "";
        String[] str =new String[numbers.length];
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<numbers.length;i++){
            str[i]=String.valueOf(numbers[i]);
        }
        Arrays.sort(str, new Comparator<String>() {         //实现比较器，这个是个重点
            @Override
            public int compare(String o1, String o2) {
                String string1 =o1+o2;
                String string2 =o2+o1;
                return string1.compareTo(string2);
            }
        });
        for(int i=0;i<str.length;i++){
            stringBuilder.append(str[i]);
        }
        return stringBuilder.toString();
    }
}
