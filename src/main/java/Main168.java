import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个正整数，返回它在 Excel 表中相对应的列名称。
 *
 * 例如，
 *
 *     1 -> A
 *     2 -> B
 *     3 -> C
 *     ...
 *     26 -> Z
 *     27 -> AA
 *     28 -> AB 
 *     ...
 * 示例 1:
 *
 * 输入: 1
 * 输出: "A"
 * 示例 2:
 *
 * 输入: 28
 * 输出: "AB"
 * 示例 3:
 *
 * 输入: 701
 * 输出: "ZY"
 */
public class Main168 {

    public String convertToTitle(int n) {
        String[] code={"","a","b","c","d","e",
                "f","g","h","i","j",
                "k","l","m","n","o",
                "p","q","r","s","t",
                "u","v","w","x","y","z"};
            for (int i=0;i<27;i++){
            code[i]=code[i].toUpperCase();
        }
        //26
        int length=code.length-1;
        int temp;
        boolean sign=false;
        List<Integer> params=new ArrayList();
        StringBuilder stringBuilder=new StringBuilder();
        if (n>length) {
            while (n>length){
                temp=n%length;
                n-=temp;
                n/=length;
                if (temp!=0){
                    params.add(temp);
                }else {
                    params.add(length);
                    sign=true;
                }
                if (sign){
                    n-=1;
                    params.add(n);
                }
            }
            if (!sign){
                params.add(n);
            }
        }else {
            stringBuilder.append(code[n]);
        }
        if (params.size()!=0){
            for (int h=params.size()-1;h>-1;h--){
                 stringBuilder.append(code[params.get(h)]);
        }}
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Main168 main168=new Main168();
        System.out.println(main168.convertToTitle(16384));
    }
}
