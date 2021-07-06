import com.google.zxing.Result;
import com.yzk18.commons.IOHelpers;
import com.yzk18.commons.ImageHelpers;
import com.yzk18.commons.JavaTimeConverters;
import com.yzk18.commons.QRCodeHelpers;

import java.awt.image.BufferedImage;

public class Test7QRCodeHelpers的使用 {
    public static void main(String[] args) {
        BufferedImage image = QRCodeHelpers.generateQRCodeImage("youthgt Test",200,200);//生成二维码 中文有问题
        ImageHelpers.writeToFile(image,"png","C:/Users/YouthGT/Desktop/Java/二维码测试/1.png");//保存到文件
        Result result = QRCodeHelpers.parseImage("C:/Users/YouthGT/Desktop/Java/二维码测试/1.png");//扫描二维码得到结果
        System.out.println(result);//打印出扫描的结果
    }
}
