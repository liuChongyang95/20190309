import java.util.Arrays;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * <p>
 * 示例:
 * <p>
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 * <p>
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 */
public class Main283 {
    public void moveZeroes(int[] nums) {
        int temp;
        for (int a = 0; a < nums.length; a++) {
            for (int b = a + 1; b < nums.length ; b++) {
                if (nums[a] == 0 && nums[b] != 0) {
                    temp = nums[b];
                    nums[b] = nums[a];
                    nums[a] = temp;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 0, 2, 0, 3, 4, 6};
        int[] b = {0, 0, 2, 0, 1};
        Main283 main283 = new Main283();
        main283.moveZeroes(b);
        System.out.println(Arrays.toString(b));
    }
}
