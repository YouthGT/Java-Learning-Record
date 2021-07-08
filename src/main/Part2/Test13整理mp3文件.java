import com.yzk18.commons.IOHelpers;

import java.io.File;

public class Test13整理mp3文件 {
    public static void main(String[] args) {
        File file = new File("E:\\歌曲");
        File[] files = file.listFiles();
        for(File pendingFile : files )
        {
            String fileName = pendingFile.getName().substring(2);
            // System.out.println(fileName);
            String[] strs = fileName.split("-");
            String singerName = strs[strs.length-2];
            String songName = strs[strs.length-1];
            //System.out.println(singerName);
            String newPath = "E:\\temp\\"+singerName+"\\"+songName;

           byte[] bytes = IOHelpers.readAllBytes(pendingFile);
           IOHelpers.writeAllBytes(newPath,bytes);
        }
    }
}
