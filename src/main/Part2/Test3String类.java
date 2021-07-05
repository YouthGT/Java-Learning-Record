import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.*;
import java.util.HashMap;
import java.util.Locale;

public class Test3String类 {
    public static void main(String[] args) {
        String s = "  hello YOUTHGT  ";
//        System.out.println(s.charAt(0));//从零位置开始
//        System.out.println(s.length());
//        System.out.println(s.startsWith("h"));
//        System.out.println(s.endsWith("o"));
//        System.out.println(s.contains("llo"));
//        System.out.println(s.replace("llo","ooo"));
//        String[] strs = s.split("l");
//        for (String s1 :strs)//增强型for循环
//        {
//            System.out.println(s1);
//        }



/**
String email ="youthgt@foxmail.com";
if(email.contains("@")&&!email.startsWith("@")&&!email.endsWith("@")&&email.endsWith(".com"))
{
    System.out.println("是邮箱");
}
else
{
    System.out.println("不是邮箱");
}
*/

        System.out.println(s.substring(3,5));//包含3不包含5   [3，5）
        String s1 = s.trim();//去掉两边的空格
        String s2 = s1.replace(" ","");//所有空格替换成空字符
        System.out.println(s2);
        String s3 = s2.toLowerCase();//获得字符串的全部小写形式
        System.out.println(s3);
    }
}
/**
 * 返回值类型   方法
 * 1、int      length（）字符串长度；
 * 2、char     charAt(int index)获得第index个位置的字符
 * 3、boolean  contains（CharSequence s）判断字符串s是否包含在本字符串中
 * 4、String   replace（CharSequence target, CharSequence replacement）把字符串中的target替换为REreplacement，（字符串具有不可变性，因此旧的不变，需要从返回值拿新的。）
 * 5、String[]  plit(String regex)把字符串按照指定的字符串拆分成多个字符串，参数是正则表达式类型，有特殊字符等转义问题以后遇到再说
 * 6、boolean  startsWith（String prefix）判断字符串是否以prefix开头
 * 7、boolean  endsWith(Strig suffix)判断字符串是否以suffix结尾
 * 8、Boolean  equalsIgnoreCase(String anotherString)忽略大小写比较字符串
 * 9、int      indexOf（String str）获取字符串Str在本字符串中第一次出现的位置
 * 10、int     lastIndexOf（String str）获取字符串Str在本字符串中最后一次出现的位置
 * 11、String substring（int beginIndex）截取字符串从开始到结束部分组成的字符串
 * 12、String substring（int beginIndex，int endIndex）截取字符串从beginIndex开始到endIndex部分组成的字符串
 * 13、String trim()去掉字符串两边的空格，中间空格不会去掉。（字符串具有不可变性，因此旧的不变，需要从返回值拿新的。）如果想要把中间的空格也去掉怎么操作？
 * 14、String toLowerCase()获得字符串的全部小写形式（字符串具有不可变性，因此旧的不变，需要从返回值拿新的。）
 * 15、String toLowerCase()获得字符串的全部大写形式（字符串具有不可变性，因此旧的不变，需要从返回值拿新的。）
 * */