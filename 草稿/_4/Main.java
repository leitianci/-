package 草稿._4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //创建事件源对象，创建高数课程，课程人数为1
        Kecheng l = new Kecheng("英语",1);
        //创建监听器对象
        ZhaoShengListener listener = new ZhaoShengListener();
        //为事件源对象添加监听器
        l.addRecruitListener(listener);

        System.out.print("请输入增加人数：");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        //为课程增加学生人数
        l.increaseStudentNumber(a);


    }

}
