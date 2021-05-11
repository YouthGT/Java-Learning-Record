public class Test6关系运算符2 {
    public static void main(String[] args) {
        /**
         * 类似C语言
         * 逻辑运算符
         *
         * &&与 ||或 ！非
         */
        int a=10;
        int b=20;
        int c=30;
        boolean b1=true;
        boolean b2=false;
        boolean b3=b1||b2;   //true
        boolean b4=b1&&b2;  //false
        boolean b5=!b1;     //false
        boolean b6=(a>b)&&b1;//false
        boolean b7=(a>b)||c>b;//true
        boolean b8=!(a==b);//true
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);
        System.out.println(b7);
        System.out.println(b8);
    }
}
