import com.yzk18.commons.IOHelpers;

public class Test11整理成绩练习 {
    public static void main(String[] args) {
        String [] lines = IOHelpers.readAllLines("F:\\AndroidStudioProjects\\java\\src\\main\\Java\\成绩表的输出\\总成绩.txt");//每行生成数组
        String [] newLines = new String[lines.length];//定义新数组存放平均成绩
        for(int i = 0;i<lines.length;i++)
        {
            double sum = 0;//保证总成绩初始化为0
            String[] line = lines[i].replace(" ","").split(",");//去除空格，并且将行生成成数组
            String name = line[0];//名字是数组第一个字符串
            for(int j = 1;j<line.length;j++)//循环求和
            {
               sum += Double.parseDouble(line[j]);
            }
            double  avg =sum/(line.length-1);//求平均值
            newLines[i] = name+","+String.format("%.2f",avg);//将平均成绩写入到新数组，且平均成绩保留两位小数类型变为字符串型
        }
        IOHelpers.writeAllLines("F:\\AndroidStudioProjects\\java\\src\\main\\Java\\成绩表的输出\\平均成绩.txt",newLines);
        System.out.println("输出平均成绩成功");
    }
}
/**
 * 科目不确定，可能名字两边，内部有空格，输出平均成绩到一个文档中
 */