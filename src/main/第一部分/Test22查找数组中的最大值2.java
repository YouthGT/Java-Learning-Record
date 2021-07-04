public class Test22查找数组中的最大值2
{
    public static void main(String[] args)
    {
        int[]num1={33,2,888,999,666,33};
        int biger=num1[0];
        for (int i=0;i<num1.length;i++)
        {
            if(num1[i]>biger)
            {
                biger=num1[i];
            }
        }
        System.out.println(biger);


    }
}
/**
 *找一个基准数进行比较
 */
