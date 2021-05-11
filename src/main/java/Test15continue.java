public class Test15continue
{
    /**
     * 跳过偶数只打印奇数
     */
    public static void main(String[] args)
    {
        for (int i=0;i<=10;i++)
        {
            if(i%2==0)
            {
                break;
            }
            System.out.println(i);
        }
        System.out.println("over");
    }
}
/**
 * break：强制结束循环
 *
 * break跳出的是for循环。
 * break 在一些计算机编程语言中是保留字，其作用大多情况下是终止所在层的循环。
 * 1、break语句对if-else的条件语句不起作用！！！！！
 * 2、在多层循环中，一个break语句只向外跳一层。
 *
 *
 * continue：不再执行本次循环后面的代码，进行下一次循环
 */
