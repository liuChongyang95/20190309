/**
 *  加一
 *
 *  给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 例子：
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 */
public class Main {

    public int[] plusOne(int[] count) {
        int temp=0;
        int[] result=new int[count.length+1];
        for(int i=count.length-1;i>-1;i--){
            if((i==0&&temp==1&&count[i]==9)||(count.length==1&&count[i]==9)){
                result[i]=1;
                count[i]=0;
                System.arraycopy(count,0,result,1,count.length);
                return result;
            }else if(i==count.length-1 && count[i]==9){
                temp=1;
                count[i]=0;
            }else{
                if(i==count.length-1){
                    count[i]+=1;
                    if(count[i]==10){
                        count[i]=0;
                        temp=1;
                    }else{
                        temp=0;
                    }
                }
                count[i]+=temp;
                if(count[i]==10){
                    count[i]=0;
                    temp=1;
                }else{
                    temp=0;
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int[] ak={9};
        Main main=new Main();

        for (int res: main.plusOne(ak)){
            System.out.println(res);
        }

    }
}
