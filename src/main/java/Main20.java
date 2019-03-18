import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "()"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 * <p>
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 * <p>
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 * <p>
 * 输入: "{[]}"
 * 输出: true
 */
public class Main20 {
    public boolean isValid(String s) {
        int param=0;
        List<Character> leftSign = new ArrayList<>();
        if (s.length() == 0) {
            return true;
        }else if (s.length()<=1){
            return false;
        }
        for (char sign : s.toCharArray()) {
            if (sign == '[' || sign == '{' || sign == '(') {
                leftSign.add(sign);
            }
            if (sign == ']' || sign == '}' || sign == ')') {
                if (leftSign.size()<1){
                    return false;
                }
                switch (sign) {
                    case ']':
                        param=2;
                        break;
                    case '}':
                        param=2;
                        break;
                    case ')':
                        param=1;
                        break;
                    default:
                        break;
                }
                if (leftSign.get(leftSign.size()-1)==(sign-param)){
                    leftSign.remove(leftSign.size()-1);
                }else {
                    return false;
                }
            }
        }
        return leftSign.size() == 0;
    }

    public static void main(String[] args) {
        Main20 main20 = new Main20();
        System.out.println(main20.isValid(""));
    }
}
