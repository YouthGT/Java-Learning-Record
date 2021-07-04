import java.io.File;
public class Test1file测试 {
    public static void main(String[] args) {
        File f1 = new File("C:/Users/YouthGT/Desktop/001/测试.txt");//复制出的路径改一下
 //f1.delete();
/**       f1.getName();
        f1.getParent();
        System.out.println(f1.getName());
        System.out.println(f1.getParent());
*/
/**
        f1.isFile();
        System.out.println(f1.isFile());
 */
   f1.mkdirs();//只会创建文件夹
        f1.getParentFile().mkdirs();

    }

}
/**
 * 1、输入输出、IO、文件、文件夹、目录
 * 2、如何显示文件的扩展名。
 * import.java.io.File；
 * 3、
 * 输入：读文件
 * 输出：写文件
 * File：代表文件或者目录(文件夹)，如果根据字符串创建File对象的话必须用new
 *4、注意注意！文件路径的区别
 * windows: \，兼容/
 *Linux  mac:/
 * 5、file只是代表逻辑上的一个文件或者目录，并不一党真正存在
 */

/**返回值类型    使用方法eg；文件对象.delate()
 *           delate();删除文件或者文件夹（如果目录非空不会删除成功）
 * boolean   exist();是否存在
 *           String getName();获得名称（最后一部分）
 * String    getParent()\String getParent()l;的到上一级
 *           getPath;得到路径部分
 * boolean   isDirectory；是否是目录
 * boolean   isFile();是否是文件
 * String[]  list()
 * File[]    listFiles();获得子项（文件及目录），不包含更下一级
 *           mkdirs();如果这个目录不存在，则创建，如果N级目录不存在，也把他们创建起来，不要错误的调用成mkdir()
 */