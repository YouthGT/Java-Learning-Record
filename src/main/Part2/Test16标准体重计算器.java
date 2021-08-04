import com.yzk18.GUI.GUI;

public class Test16标准体重计算器 {
    public static void main(String[] args) {
        String 性别 = GUI.buttonsBox("选择您的性别","男","女");
        double 身高 = GUI.doubleBox("请输入身高(cm)");
        double 体重 = GUI.doubleBox("请输入体重(kg)");
        double 标准体重;
        if (性别.equals("男"))
        {
            标准体重 = (身高-80)*0.7;
            GUI.msgBox(标准体重);
        }
        else
        {
            标准体重 = (身高-70)*0.6;
            GUI.msgBox(标准体重);
        }
        double temp = (体重-标准体重)/标准体重;
        if(temp<=0.1&&temp>=-0.1)
        {
            GUI.msgBox("正常体重");
        }
        else if (temp>0&&temp<=0.2)
        {
            GUI.msgBox("偏胖");
        }
        else if (temp<0&&temp>=-0.2)
        {
            GUI.msgBox("偏瘦");
        }
        else if (temp>0&&temp>0.2)
        {
            GUI.msgBox("严重偏胖");
        }
        else if (temp<0&&temp<-0.2)
        {
            GUI.msgBox("严重偏瘦");
        }
    }
}
