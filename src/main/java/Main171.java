/**
 * 给定一个Excel表格中的列名称，返回其相应的列序号。
 *
 * 例如，
 *
 *     A -> 1
 *     B -> 2
 *     C -> 3
 *     ...
 *     Z -> 26
 *     AA -> 27
 *     AB -> 28
 *     ...
 */
public class Main171 {
    public int titleToNumber(String s) {
        int logn=0;
        int result=0;
        for (int i = s.length()-1; i>-1; i--){
            char simple=s.charAt(i);
            if (i==s.length()-1){
                result+=(simple-64);
            }else {
                result+=(simple-64)*Math.pow(26,logn);
            }
            logn++;
        }
        return result;
    }

    public static void main(String[] args) {
        Main171 main171=new Main171();
        System.out.println(main171.titleToNumber("AA"));
    }
}
