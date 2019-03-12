//给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
//
//        示例 1:
//
//        输入: 123
//        输出: 321
//        示例 2:
//
//        输入: -123
//        输出: -321
//        示例 3:
//
//        输入: 120
//        输出: 21
//        注意:
//
//        假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
public class Main7 {
    public int reverse(int x) {
        Double limit = Math.pow(2, 32);
        boolean sign = false;
        int result;
        //清除结尾的0
        if (x != 0 && x % 10 == 0) {
            while (x % 10 == 0) {
                x /= 10;
            }
        }
        if (x < 0) {
            sign = true;
        }
        String cin = String.valueOf(x);
        StringBuilder stringBuilder = new StringBuilder();
        for (int a = cin.length() - 1; a > -1; a--) {
            stringBuilder.append(cin.charAt(a));
        }
        if (sign) {
            try {
                result = 0 - Integer.valueOf(stringBuilder.toString().replace("-", ""));
            } catch (NumberFormatException n) {
                return 0;
            }
        } else {
            try {
                result = Integer.valueOf(stringBuilder.toString());
            } catch (NumberFormatException n) {
                return 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Main7 main7 = new Main7();
        System.out.println(main7.reverse(9000000));
    }
}
