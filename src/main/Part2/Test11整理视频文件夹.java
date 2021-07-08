import com.yzk18.commons.IOHelpers;

import java.io.File;

public class Test11整理视频文件夹 {
    public static void main(String[] args) {
    File file = new File("E:\\Learn\\考研\\数学\\张宇36讲\\概率论9讲");
    File[] dirs = file.listFiles();//生成文件数组
    for (File dir : dirs)//遍历文件夹下的文件夹
    {
        for (File pendingFile : dir.listFiles())//遍历第二层文件下的视频文件
        {
            String filePath = pendingFile .getPath();//得到视频文件目录
            String[] strs = filePath.replace("\\","/").split("/");//将分隔符转换，并且将各个部分打成数组
            String folderName = strs[strs.length-2];//得到文件夹名称
            String fileSuffix = IOHelpers.getExtension(filePath);//得到文件的路径
            String newFilepath= "E:\\Learn\\考研\\数学\\张宇36讲\\概率论9讲\\output\\"+folderName+"."+fileSuffix;//得到新的文件路径
            byte[] bytes = IOHelpers.readAllBytes(pendingFile);//将预处理文件打成字节数组
            IOHelpers.writeAllBytes(newFilepath,bytes);//将预处理文件写回成文件

        }
    }
    }
}
