package experiment.experiment_3;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //创建事件源对象，创建高数课程，课程人数为2
        Lesson l = new Lesson("高数",2);
        //创建监听器对象
        RecruitListener listener = new RecruitListener();
        //为事件源对象添加监听器
        l.addRecruitListener(listener);

        System.out.print("请输入增加人数：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //为课程增加学生人数
        l.addStudentNumber(a);
    }



}
