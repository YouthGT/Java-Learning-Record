import java.time.LocalDateTime;
import java.util.Date;

public class Test2日期date {
    public static void main(String[] args) {
        LocalDateTime m1= LocalDateTime.now();
        System.out.println(m1);
    //    LocalDate m2= LocalDate.of(2009,10,12);
    //    System.out.println(m2);
        System.out.println(m1.getYear());
        System.out.println(m1.getDayOfYear());//这一年的第几天
        System.out.println(m1.getMonthValue());//阿拉伯数字打印类型int
        System.out.println(m1.getMonth());//类型字符串 English
        System.out.println(m1.getHour());
        System.out.println(m1.getMinute());
        System.out.println(m1.getSecond());
    }
}
/**
 * 在Jdk1.8之前，日期都用Date，难用
 * import java.time.XXX:
 * LocalDate 日期
 * 3、获取当前日期：LocalDate d1 = LocalDateTime：
 *    获取指定日期：LocalDate d1 = LocalDate.of(2021.7.5);
 *    把字符串解析为日期：LocalDate d1 = LocalDate.parse(“2021-7-5”);
 *    日期对象.getXXX()用于获取年月日部分；
 * LocalTime 时间
 *.getXXX（）；用于获取分秒。。。
 * 方法类似
 * LocalDateTime日期加时间
 */