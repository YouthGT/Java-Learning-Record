public class Test5关系运算符 {
    public static void main(String[] args) {
        /**
         * 与C语言类似
         * 关系运算符为布尔类型的值
         */
        boolean b1 = 2<=2;
        System.out.println(b1);
        boolean b2 = 2==2;
        System.out.println(b2);
        boolean b3 = 2>=2;
        System.out.println(b3);
        boolean b4 = 2>2;
        System.out.println(b4);
        /**
         * 字符串比较 特殊
         * 用s1.equals(s2)比较虽然==可以出结果但是不能用
         * js python 都可以==比较字符串
         */
        String name1="youthgt";
        String name2="youthgt";
        //boolean b5=name1==name2;
        boolean b5=name1.equals(name2);
        System.out.println(b5);

    }
}
