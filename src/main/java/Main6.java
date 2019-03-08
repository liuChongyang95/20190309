/**
 * 给定一组非负整数，重新排列它们的顺序使之组成一个最大的整数。
 *
 * 示例 1:
 *
 * 输入: [10,2]
 * 输出: 210
 * 示例 2:
 *
 * 输入: [3,30,34,5,9]
 * 输出: 9534330
 * 说明: 输出结果可能非常大，所以你需要返回一个字符串而不是整数。
 */
public class Main6 {
//    int temp=1234;
//    String tempStr=String.valueOf(temp);
//    String first=tempStr.substring(0,1);
//    int result=Integer.valueOf(first);


    public String largestNumber(int[] nums) {
        int big=Integer.valueOf(String.valueOf(nums[0]).substring(0,1));
        int component=0;
        for (int i=1;i<nums.length;i++){
            int temp2=Integer.valueOf(String.valueOf(nums[i]).substring(0,1));
            if (temp2>big){
                big=temp2;
                component=nums[i];
            }
        }
        return String.valueOf(big+" "+component);
    }

    public static void main(String[] args) {
//        System.out.println(new Main6().result);
        int[] nums={111,23,41};
        System.out.println(new Main6().largestNumber(nums));
    }
}
