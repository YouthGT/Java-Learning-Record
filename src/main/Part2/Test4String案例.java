import java.util.Locale;

public class Test4String案例 {
    public static void main(String[] args) {
        /**获取文件名
         *         String s = "C:/Users/YouthGT/Desktop/001.txt";
         *         int lastIndexOfSlash = s.lastIndexOf("/");//获取最后一次斜线位置
         *         String filename = s.substring(lastIndexOfSlash+1);//最后位置加1
         *         System.out.println(filename);//输出文件名
         *
         */
        /**获取文件名 法2
         *         String s = "C:/Users/YouthGT/Desktop/001.txt";
         *                    String[] strs = s.split("/");//按照斜线分成数组
         *                    String filename = strs[strs.length-1];//最后一个字符串数组就是文件名
         *                    System.out.println(filename);//输出文件名
         */
        /**获取后缀名
         *         String s = "C:/Users/YouthGT/Desktop/001.txt";
         *         int last = s.lastIndexOf(".");
         *         String s2 = s.substring(last+1);
         *         System.out.println(s2);
         */
        /**登录用户名及密码判断
         *  String username = "admin";
         * String password = "123456";
         *       if(username.trim().equalsIgnoreCase("admin")&&password.equals("123456"))
         *         {
         *             System.out.println("ok");
         *         }
         *       else
         *         {
         *             System.out.println("error");
         *         }
         */
        /**获取等号前后的值 split用法
         *
         *         String s = "name=youthgt";
         *         String [] strs = s.split("=");
         *         System.out.println("等号前的"+strs[0]);
         *         System.out.println("等号后的"+strs[1]);
         */
        /**判断文件是否是jpg文件，忽略文件名的大小写
        * String file = "C:/Users/YouthGT/Desktop/001.jpg";
        * System.out.println(file.toLowerCase().endsWith(".jpg"));//返回值布尔类型
        * */
    }
}
