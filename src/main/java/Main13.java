import com.sun.org.apache.bcel.internal.generic.FADD;

/**
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 * <p>
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 * <p>
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 * <p>
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "III"
 * 输出: 3
 * 示例 2:
 * <p>
 * 输入: "IV"
 * 输出: 4
 * 示例 3:
 * <p>
 * 输入: "IX"
 * 输出: 9
 * 示例 4:
 * <p>
 * 输入: "LVIII"
 * 输出: 58
 * 解释: L = 50, V= 5, III = 3.
 * 示例 5:
 * <p>
 * 输入: "MCMXCIV"
 * 输出: 1994
 * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
 */
public class Main13 {
    public int romanToInt(String s) {
        char[] signs = s.toCharArray();
        int addValue = 0;
        boolean jump=false;
        for (int limit = signs.length - 1; limit > -1; limit--) {
            char temp = signs[limit];
            if (jump){
                jump=false;
                continue;
            }
            //是否跳过
            //如果是I，并且左边一位是X或者V，则准备下一次循环跳过
            switch (temp) {
                case 'I':
                    addValue += 1;
                    break;
                case 'V':
                    if (limit==0){
                        addValue += 5;
                        break;
                    }
                    if (signs[limit-1] == 'I') {
                        jump=true;
                        addValue += 4;
                    } else {
                        addValue += 5;
                    }
                    break;
                case 'X':
                    if (limit==0){
                        addValue += 10;
                        break;
                    }
                    if (signs[limit-1] == 'I') {
                        jump=true;
                        addValue += 9;
                    } else {
                        addValue += 10;
                    }
                    break;
                case 'L':
                    if (limit==0){
                        addValue += 50;
                        break;
                    }
                    if (signs[limit-1] == 'X') {
                        jump=true;
                        addValue += 40;
                    } else {
                        addValue += 50;
                    }
                    break;
                case 'C':
                    if (limit==0){
                        addValue += 100;
                        break;
                    }
                    if (signs[limit-1] == 'X') {
                        jump=true;
                        addValue += 90;
                    } else {

                        addValue += 100;
                    }
                    break;
                case 'D':
                    if (limit==0){
                        addValue += 500;
                        break;
                    }
                    if (signs[limit-1] == 'C') {
                        jump=true;
                        addValue += 400;
                    } else {
                        addValue += 500;
                    }
                    break;
                case 'M':
                    if (limit==0){
                        addValue += 1000;
                        break;
                    }
                    if (signs[limit-1] == 'C') {
                        jump=true;
                        addValue += 900;
                    } else {
                        addValue += 1000;
                    }
                    break;
                default:
                    break;
            }
        }
        return addValue;
    }

    public static void main(String[] args) {
        Main13 main13 = new Main13();
        System.out.println(main13.romanToInt("MXCIV"));
    }
}
