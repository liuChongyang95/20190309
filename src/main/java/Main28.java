/**
 * 实现 strStr() 函数。
 *
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *
 * 示例 1:
 *
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * 示例 2:
 *
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 * 说明:
 *
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 *
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 */
public class Main28 {
    public int strStr(String haystack, String needle) {
        if (needle==null || needle.length()<=0){
            return 0;
        }
        if (haystack.length()<needle.length()){
            return -1;
        }
        boolean sign=false;
        int rs=-1;
        for (int a=0;a<haystack.length();a++){
            if (haystack.charAt(a)==needle.charAt(0)){
                for (int b=0;b<needle.length();b++){
                    try {
                        if (haystack.charAt(a+b)==needle.charAt(b)){
                            sign=true;
                        }else {
                            sign=false;
                            break;
                        }
                    }catch (Exception e){
                        return -1;
                    }
                }
            }
            //haystack最后的needle.length()位置判断
            if (haystack.length()-a==needle.length()){
                if (!sign){
                    rs=-1;
                    break;
                }
            }
            if (sign){
                rs=a;
                break;
            }
        }
        return rs;
    }

    public static void main(String[] args) {
        Main28 main28=new Main28();
        System.out.println(main28.strStr("mississippi"
               , "pi"));
    }
}
