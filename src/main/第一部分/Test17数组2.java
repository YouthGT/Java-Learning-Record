public class Test17数组2
{
    public static void main(String[] args)
    {
        /**
         * 字符串数组
         * String[]a=new String[10]
         * byte[]bytes=new byte[];
         * byte[]bytes={3,5,7,9,0,1}
         */
      /*
       String[]a={"hello","youthgt","18"};
        System.out.println(a.length);
        //结果为3

       */

        /**
         * 遍历输出数组的元素
         */
        String[]a={"hello","youthgt","18"};
        for (int i=0;i<a.length;i++)//数组长度减1，所以不写等于号
        {
            System.out.println(a[i]);
        }
    }
}
/**
 * 1.数组的特殊用法：数组名.length，这样可以获取数组的长度，可以避免上面吧数组长度写死的问题
 * int len = al.length
 * 2.避免魔法数
 * 在循环里面很好的加数据，而不需要改变其他的循环次数啥的
 * 做到代码会说出注释！！！
 */