public class Test21查找数组中的最大值
{
    public static void main(String[] args)
    {
        int[]num1={3,8,9,11,12,13};
        for (int i=0;i+1<num1.length;i++)
        {
            if (num1[i]>num1[i+1] )//由小到大排序
            {
                int temp=num1[i];//交换数据比较大小
                num1[i]=num1[i+1];
                num1[i+1]=temp;
            }
        }
        System.out.println(num1[num1.length-1]);
    }
}
