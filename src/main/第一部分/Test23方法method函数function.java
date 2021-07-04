import java.util.Arrays;

public class Test23方法method函数function {
    public static void main(String[] args) {
            String[]a={"hello","youthgt","18"};
            int[]b={1,2,56,45,55} ;
            String s= Arrays.toString(a);//把数组转换为可读性强的字符串
            String n=Arrays.toString(b);//int型也可以
            System.out.println(s);
            System.out.println(n);
    }
}
/**
 * 程序=数据+命令+逻辑
 * 方法就是组成程序的可以“重复使用”的积木，方法把复杂的N行代码封装起来，
 * 让使用者可以通过“方法名”调用（使用）。比如println（）内部就很复杂
 *
 * 方法：方法名+参数+返回值
 * 1）方法名是别人调用本命令的标识符
 * 2）参数是调用方法的时候传递的数据。方法可能没有参数或者N个参数 调用方法要足量的、正确的类型的传递参数
 * 3）返回值是方法调用完的结果。方法可能没有返回值对应有返回值的方法，我们也可以忽略返回值
 *
 * 两种方法：
 * 别人写好的方法：JDK内置的方法：第三方库中的方法：
 * 先学怎么调用别人的，熟练了再自己写
 *
 * 重载方法（名字一样）
 * 允许存在一个以上的同名方法，只要参数个数或者参数类型不同即可。这些方法叫做“重载方法”
 * 编译器会根据调用的时候传递的参数的个数、类型来匹配合适的重载方法
 *例如toString方法有好几种long char 等等
 *
 * 方法的调用语句
 * 方法名（参数列表）；
 * 或者有返回值且需要返回值，则：变量=方法名（参数列表）
 * Arrays.toString（）需要把提前把对应方法的类import进来
 */