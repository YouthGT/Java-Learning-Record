public class Test12while案例 {
    public static void main(String[] args) {
        /**
         * 从1加到10
         */
        int i=0;
        int sum=0;
        while(i<=10)//满足该条件则一直循环
        {
            sum+=i;
            System.out.println("sum:"+sum+",i="+i);
            i++;
        }
        System.out.println("总和:"+sum);
    }
}
