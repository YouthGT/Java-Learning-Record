import com.yzk18.commons.IOHelpers;

public class Test5Maven的使用 {
public static void main(String[]args){
        String s = IOHelpers.readAllText("C:/Users/YouthGT/Desktop/ceshi .txt");//读txt文件中的所有字符
        System.out.println(s);
        }
}
/**
 * 1、java的IO操作的类对初学者不友好； Stream、Reader、编码、异常。。。。
 * 2、Java可以直接下载，引用jar的方式使用第三方的库：但是太复杂，现在都素使用maven等包的管理方式Maven会自动吧库以及依赖堵塞库自动下载、引用。
 * 3、默认国外的服务器下载库，可能速度比较慢，可以配置镜像服务器，配置一次即可（全局的）
 * 4、配置pom.xml中的依赖库 maven仓库的查找
 *
 */