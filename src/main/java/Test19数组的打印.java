//import java.util.Arrays;
 import java.util.Arrays;//util：功用
public class Test19数组的打印 {
    public static void main(String[] args) {
        String[]a={"hello","youthgt","18"};
        int[]b={1,2,56,45,55} ;
        String s=Arrays.toString(a);//把数组转换为可读性强的字符串
        String n=Arrays.toString(b);//int型也可以
        System.out.println(s);
        System.out.println(n);
    }
}
/**
 * 打印数组
 * 1.手动for循环
 * 2.import Java.util.Arrays;
 * 然后Arrays.toString（a）
 * 3.idea 自动import功能，不要错误地import同类名
 */
