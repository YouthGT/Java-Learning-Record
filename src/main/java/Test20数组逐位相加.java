import java.util.Arrays;//数组变字符串需要用到
public class Test20数组逐位相加 {
    public static void main(String[] args) {
        int[]num1={3,8,9};
        int[]num2={5,2,8};
        int[]num3=new int[3];
        for(int i=0;i<3;i++)
        {
                num3[i]=num1[i]+num2[i];
        }
        String n=Arrays.toString(num3);
        System.out.println(n);

    }
}
