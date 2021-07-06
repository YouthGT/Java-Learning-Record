import com.google.zxing.Result;
import com.yzk18.commons.IOHelpers;
import com.yzk18.commons.QRCodeHelpers;

public class Test8检测图片是否存在二维码 {
    public static void main(String[] args) {
    String[] files = IOHelpers.getFilesRecursively("C:\\Users\\YouthGT\\Desktop\\yzk18","png","jpg");
    boolean qrcodeFound = false;
        for (String file:files)
        {
            Result result = QRCodeHelpers.parseImage("file");
            if (result != null)
            {
                qrcodeFound = true;
                break;
            }
        }
        if (qrcodeFound)
        {
            System.out.println("含有二维码");
        }
        else
        {
            System.out.println("不含二维码");
        }
    }
}
