public class Test8选择结构 {
    public static void main(String[] args) {
        /**类似于C语言
         * 两种语句 if，switch，if用的最多，可以代替switch
         */
        int age=18;
        /**
         * if { }
         */
        if (age>18)
        {
            System.out.println("大于18");
        }
        System.out.println("年轻的很,小伙子");
        /**
         * if {} else {}
         * if{} elseif {} 。。。else
         * if还可以嵌套
         * */
         age=8;
        if (age>18)//if后不要加分号
        {
            System.out.println("大于18");
        }
        else if(age<18)
        {
            System.out.println("年轻的很,小伙子");
        }
        else if(age<10)
        {
            System.out.println("小屁孩");
        }

    }
}
