/**
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 2.00000, 10
 * 输出: 1024.00000
 * 示例 2:
 * <p>
 * 输入: 2.10000, 3
 * 输出: 9.26100
 * 示例 3:
 * <p>
 * 输入: 2.00000, -2
 * 输出: 0.25000
 * 解释: 2-2 = 1/22 = 1/4 = 0.25
 * 说明:
 * <p>
 * -100.0 < x < 100.0
 * n 是 32 位有符号整数，其数值范围是 [−231, 231 − 1] 。
 */
public class Main50 {
    public double myPow(double x, int n) {
        double param = x;
        if (n % 2 == 0) {
            if (n > 0) {
                for (int i = 2; i <= n/2; i++) {
                    x *= param;
                }
                
                return x;
            } else if (n == 0) {
                return 1d;
            } else {
                for (Long i = Long.valueOf(String.valueOf(n).replace("-", "")); i > 1; i--) {
                    x *= param;
                }
                x = 1 / x;
                return x;
            }
        } else {

        }

    }

    public static void main(String[] args) {
        Main50 main50 = new Main50();
        System.out.println(main50.myPow(0.00001
                , 2147483647));
        System.out.println((-2) * (2));
    }
}
