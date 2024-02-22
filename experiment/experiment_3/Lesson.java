package experiment.experiment_3;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Lesson implements Serializable {
    private String name;
    private int studentNumber = 0;
    private final int studentNumberLimitation = 6;

    private static List<RecruitListenerInterface> listeners = new ArrayList<RecruitListenerInterface>();


    public Lesson() {
        this.name = "默认课程名";
        this.studentNumber = 0;
    }

    public Lesson(String name, int studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
        System.out.println(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void addStudentNumber(int x){
        this.studentNumber += x;
        System.out.println(this.name + "选课人数+" + x);
        System.out.println(this);

        //学生人数超过6人触发招生事件
        if(this.studentNumber > studentNumberLimitation){
            RecruitEvent event = new RecruitEvent("");
            this.fireRecruitEvent(event);
        }
    }



    //添加一个监听
    public void addRecruitListener(RecruitListenerInterface e){
        listeners.add(e);
    }

    //删除一个监听
    public void removeRecruitListener(RecruitListenerInterface e){
        listeners.remove(e);
    }

    //激活监听事件
    public void fireRecruitEvent(RecruitEvent event){
        for(RecruitListenerInterface listener : listeners){
            listener.recruit(event);
        }

    }

    @Override
    public String toString() {
        return "Lesson{" +
                "name='" + name + '\'' +
                ", studentNumber=" + studentNumber +
                '}';
    }
}
