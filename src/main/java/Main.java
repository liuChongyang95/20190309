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
