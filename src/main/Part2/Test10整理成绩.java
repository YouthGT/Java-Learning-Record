import com.yzk18.commons.IOHelpers;

import java.util.Arrays;

public class Test10整理成绩 {
    public static void main(String[] args) {
        String [] lines = IOHelpers.readAllLines("F:\\AndroidStudioProjects\\java\\src\\main\\Java\\成绩表的输出\\总成绩.txt");
        for (String line : lines)
        {
            String [] strs = line.split(",");
            String name = strs[0];
            double chinese= Double.parseDouble(strs[1]);
            double math = Double.parseDouble(strs[2]);
            double english = Double.parseDouble(strs[3]);
            double avg =(chinese+math+english)/3;
            String msg = name + "你好，你的成绩"+"语文"+chinese+"数学"+math+"英语"+english+"平均分"+avg;
            IOHelpers.writeAllText("F:\\AndroidStudioProjects\\java\\src\\main\\Java\\成绩表的输出\\"+name+".txt",msg);

        }
    }
}
