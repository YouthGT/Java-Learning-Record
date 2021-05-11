public class Test16数组
{
    /**
     *数组
     * int[] a=new int[10];
     * int a []=new int[10];
     * 每个元素为默认值 int,double默认是0，boolean默认是false String默认是是null
     * 数组的元素下标从0开始，最后一个元素的下标为长度减一
     * 引用数组的形式：数组名下标 eg：a[0]
     */
    public static void main(String[] args) {
        int[] num1={3,5,9,88,66,3};
        int[] num2=new int[10];
        System.out.println(num1[1]);//5
        System.out.println(num1[2]);//9
        num2[1]=8;
        System.out.println(num2[1]);//8
        num1[0]=num1[1]+num1[2];
        System.out.println(num1[0]);//14
        System.out.println(num1[5]);//3


    }
}
/**
 * 问题：Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
 * 解决方法：数组取值超范围
 */
