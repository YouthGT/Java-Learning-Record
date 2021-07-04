public class Test3 {
    public static void main(String[] args) {
        double num = 1.0 / 3;//整数除以整数一直是整数
        System.out.println(num);
        String name="youthgt";
        String name2="18";
        String name3= "src/main/test";//字符串是双引号括住字符
        System.out.println(name+name2+" "+name3+num);//字符串的链接
        /** javaDoc注释方法
         *
         * 表达式从左向右执行（除非括号改变优先级）
         * 其他数据类型遇到字符串，之后就要按照字符串计算
         * */
        System.out.println("\n"+3+(6+"a")+("b"+(1+2)*3));
    }
}
/**
 * 问题1：java语法错误：进行分析时已经到达文件结尾
 * 解决方法：一般是因为括号没有闭合，或者缺少了分号
 */

