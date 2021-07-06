import com.google.zxing.Result;
import com.yzk18.commons.IOHelpers;
import com.yzk18.commons.QRCodeHelpers;
import org.apache.commons.io.filefilter.IOFileFilter;

public class Test9检测二维码是否包含网址 {
    public static void main(String[] args) {
        String [] files = IOHelpers.getFilesRecursively("F:\\AndroidStudioProjects\\java\\src\\main\\Java\\二维码测试","png","jpg","gif");
        boolean qrcodeFoundSite = false;
        for (String file:files)
        {
            Result result = QRCodeHelpers.parseImage(file);
            if (result.getText().startsWith("http://")||result.getText().startsWith("https://"))
            {
                qrcodeFoundSite = true;
                break;
            }


        }
        if (qrcodeFoundSite)
        {
            System.out.println("有宣传性二维码图片");
        }
        else
        {
            System.out.println("检测通过");
        }
    }

}
