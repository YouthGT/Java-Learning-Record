import java.util.Arrays;//数组变字符串需要用到
public class Test20数组逐位相加 {
    public static void main(String[] args) {
        int[]num1={3,8,9};
        int[]num2={5,2,8};
        int[]num3=new int[3];
        //for(int i=0;i<3;i++)
        for (int i=0;i<num3.length;i++)
        {
                num3[i]=num1[i]+num2[i];
        }
        System.out.println(Arrays.toString(num3));

    }
}
