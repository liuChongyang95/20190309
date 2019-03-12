/**编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。

 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。

 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。



 示例 1：

 输入：["h","e","l","l","o"]
 输出：["o","l","l","e","h"]
 示例 2：

 输入：["H","a","n","n","a","h"]
 输出：["h","a","n","n","a","H"]
 *
 */
public class Main344 {
    public void reverseString(char[] s) {
        float length=s.length;
        int middle=Math.round(length/2);
        char temp;
        if (length%2!=0){
            for (int i=1;i<Math.round(length/2);i++){
                temp=s[i-1];
                s[i-1]=s[2*middle-2-(i-1)];
                s[2*middle-2-(i-1)]=temp;
            }
        }else {
            for (int i=s.length;i>middle;i--){
                temp=s[i-1];
                s[i-1]=s[middle-(i-middle)];
                s[middle-(i-middle)]=temp;
            }
        }
        for (char r:s){
            System.out.println(r);
        }
    }

    public static void main(String[] args) {
        char[] g={'a','b','c','d','e','f'};
        Main344 main344=new Main344();
        main344.reverseString(g);
    }
}
