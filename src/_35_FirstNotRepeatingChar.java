import java.util.HashMap;

/**
 * Created by hezs1 on 2017/1/6.
 */
/*
在一个字符串(1<=字符串长度<=10000，全部由大写字母组成)中找到第一个只出现一次的字符,并返回它的位置
 */
//思路是用字符的ASCII值作为数组的下标，因为ASCII只有256位，故只要开辟一个大小为256的数组就可以了
public class _35_FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        if (str.length()==0)
           return 0;
        int [] hashmap = new int[256];
        char[] string=str.toCharArray();
        for (int i=0;i<hashmap.length;i++){
            hashmap[string[i]]++;
        }
        int index=0;
        for (;index<string.length;index++){
            if (hashmap[string[index]]==1)
                break;
        }
        return index;
    }
}
