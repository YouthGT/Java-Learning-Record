import com.yzk18.commons.IOHelpers;

public class Test6yzk18commons库的使用 {
    public static void main(String[] args) {
        System.out.println(IOHelpers.getExtension("C:/Users/YouthGT/Desktop/yzk18/index.html"));
    }
}
/**文件的数据格式
 * 文件是以字节的形式存到磁盘上的，也就是一堆byte=byte[]，不同的文件格式只不过按照不同的文件格式标准来保存这些byte[]而已
 * 文本文件也是二进制文件 中文编码格式多种 有不同的编码标准
 * Word、PDF不是文本格式。文本格式的判断标准是能不能用文本编辑器打开
 */
/**学会学习 阅读文档
 * Trial and Error
 * maven 点击 view all  下载Javadoc的jar,然后解压，就可以查看文档；也可以在IDEA中download source
 * 如何阅读文档 如何尝试
 * JDK内置类的javaDOC
 */