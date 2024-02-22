package 草稿._4;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class Kecheng implements ActionListener, Serializable {
    private String name;
    private int studentNumber = 0;
    private final int studentNumberLimitation = 2;

    private static List<ZhaoShengListenerInterface> listeners = new LinkedList<ZhaoShengListenerInterface>();


    public Kecheng() {
        this.name = "语文";
        this.studentNumber = 1;
    }

    public Kecheng(String name, int studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
        print(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.studentNumber ++ ;
        //学生人数超过2人触发招生事件
        if(this.studentNumber > studentNumberLimitation){
            ZhaoShengEvent event = new ZhaoShengEvent("");
            this.fireRecruitEvent(event);
        }
    }



    public void increaseStudentNumber(int x){
        this.studentNumber += x;
        print(this);

        //学生人数超过6人触发招生事件
        if(this.studentNumber > studentNumberLimitation){
            ZhaoShengEvent event = new ZhaoShengEvent("");
            this.fireRecruitEvent(event);
        }
    }



    //添加一个监听
    public void addRecruitListener(ZhaoShengListenerInterface e){
        listeners.add(e);
    }


    //激活监听事件
    public void fireRecruitEvent(ZhaoShengEvent event){
        for(ZhaoShengListenerInterface listener : listeners){
            listener.recruit(event);
        }

    }



    public void print(Kecheng k){
        System.out.println(k.name + "课程人数为：" + k.studentNumber);
    }



}
