public class Test4赋值运算符
{
    public static void main(String[]args)
        {/**
         * 复合赋值运算符
         * 类似于C语言
         * eg:a+=5 a=a+5
         * 奥卡姆剃刀原理：如非必要，勿增实体
         * KISS: Keep it stupid & simple
         * 区分a++与++a的区别
         */
            int a;
            int b;
            int c;
            a=10;
            b=a+5;
            c=a-b;
            System.out.println(a+","+b+","+c);
            a=10;
            b=a++;
            System.out.println("a++,"+a);
            System.out.println("a++,"+b);//a++先用后加
            a=10;
            b=++a;
            System.out.println("++a,"+a);
            System.out.println("++a,"+b);//++a先加再用
        }
}

