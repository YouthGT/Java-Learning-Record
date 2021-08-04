import com.yzk18.GUI.GUI;


import java.time.LocalDateTime;

public class Test15选择日期gui {
    public static void main(String[] args) {
        LocalDateTime d1 = GUI.datetimeBox("请选择日期和时间");
        System.out.println(d1);
    }
}
/**
 * 这些对话框是模态对话框，选择完才会继续走
 * Double 可以为null double不可以
 */
