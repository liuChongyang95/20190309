/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 示例 1:
 * <p>
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * <p>
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 * <p>
 * 所有输入只包含小写字母 a-z 。
 */
public class Main14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0){
            return "";
        }
        int minLength=strs[0].length();
        for (String str:strs){
            if (str.length()<minLength){
                minLength=str.length();
            }
        }
        String temp = strs[0];
        char[] signs = temp.toCharArray();
        StringBuilder rs = new StringBuilder();
        int access = 0;
        end:
        for (int a=0;a<minLength;a++) {
            char now=signs[a];
            for (String string : strs) {
                if (now==string.charAt(a)){
                    access++;
                    if (access == strs.length) {
                        access = 0;
                        rs.append(now);
                    }
                } else {
                    break end;
                }
            }
        }
        return rs.toString();
    }

    public static void main(String[] args) {
        Main14 main14 = new Main14();
        String[] param = {"flower","flow","flight"};
        System.out.println(main14.longestCommonPrefix(param));
    }

}
