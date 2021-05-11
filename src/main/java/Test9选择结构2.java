public class Test9选择结构2 {
    public static void main (String[] args){
        /**
         * switch结构
         * 每个case后记得加break
         * 使用比if少
         */
        int m=5;
        switch (m)
        {
            case 1:
                break;
            case 5:
                System.out.println("匹配");
                break;
            case 3:
                System.out.println("不匹配");

        }
    }
}
