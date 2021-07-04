public class Test18增强for循环 {
    public static void main(String[] args) {
        /**
         * for（元素类型 item：array name）
         * {
         *    System.out.println(item);
         * }
         */
        String[]a={"hello","youthgt","18"};
        for (String test:a)//遍历字符串数组a的每个元素，用test变量来获取，对于每一个遍历到的元素都执行一次循环体
        {
            System.out.println(test);
        }
    }
}
