package 草稿._2;

import java.awt.*;
import javax.swing.*;

public class LabelShowThread { //主类

    public static void main(String[] args) {

        Gui gui = new Gui();// 创建Gui的对象

        LabelThread_1 lt_1 = new LabelThread_1(gui); //创建各线程的对象
        LabelThread_2 lt_2 = new LabelThread_2(gui);
        LabelThread_3 lt_3 = new LabelThread_3(gui);
        LabelThread_4 lt_4 = new LabelThread_4(gui);

        lt_1.start();//对象启动
        lt_2.start();
        lt_3.start();
        lt_4.start();
    }

}

class Gui extends JFrame { // 窗口界面类
    private static final long serialVersionUID = 1L;

    JLabel jl_1;
    JLabel jl_2;
    JLabel jl_3;
    JLabel jl_4;

    JFrame jf;

    public Gui() {
        jf = new JFrame("多线程显示和隐藏");// 设置标题

        jl_1 = new JLabel("标签一");
        jl_2 = new JLabel("标签二");
        jl_3 = new JLabel("标签三");
        jl_4 = new JLabel("标签四");

// 四个标签都设置为可见
        jl_1.setVisible(false);
        jl_2.setVisible(false);
        jl_3.setVisible(false);
        jl_4.setVisible(false);

        jf.setLayout(new GridLayout(4,1));// 设置面板的布局管理

        jf.add(jl_1);// 把标签添加到面板
        jf.add(jl_2);
        jf.add(jl_3);
        jf.add(jl_4);
        jf.setSize(300, 300);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);// 面板设置为可见
        jf.setBackground(Color.blue);
    }

}

class LabelThread_1 extends Thread {// 标签一线程类
    Gui _gui;
    public LabelThread_1(Gui gui){
        _gui = gui;
    }

    synchronized public void run() {

        int i = 0;
        while (true) { //循环30次
            _gui.jl_1.setVisible(true); //设置标签一为可见
            i++;
            try {
                Thread.sleep(1000); //休眠
                _gui.jl_1.setVisible(true);//重新设置标签一为可见
            } catch (InterruptedException ie) {
                System.out.print(ie.getMessage());
            }
            _gui.jl_1.setVisible(false); //设置标签一为不可见
            try {
                Thread.sleep(1000); //休眠
                _gui.jl_1.setVisible(true);//重新设置标签一为可见
            } catch (InterruptedException ie) {
                System.out.print(ie.getMessage());
            }

        }
    }
}

class LabelThread_2 extends Thread {// 标签二线程类
    Gui _gui;

    public LabelThread_2(Gui gui){
        _gui = gui;
    }
    synchronized public void run() {

        int i = 0;
        while (i < 30) {//循环30次
            _gui.jl_2.setVisible(true); //设置标签二为可见
            i++;
            try {
                Thread.sleep(1000); //休眠
                _gui.jl_2.setVisible(true);//重新设置标签二为可见
            } catch (InterruptedException ie) {
                System.out.print(ie.getMessage());
            }
            _gui.jl_2.setVisible(false); //设置标签二为不可见
            try {
                Thread.sleep(1000); //休眠
                _gui.jl_2.setVisible(true);//重新设置标签二为可见
            } catch (InterruptedException ie) {
                System.out.print(ie.getMessage());
            }
        }
    }
}

class LabelThread_3 extends Thread {// 标签三线程类
    Gui _gui;

    public LabelThread_3(Gui gui){
        _gui = gui;
    }
    public void run() {

        int i = 0;
        while (i < 30) {//循环30次
            _gui.jl_3.setVisible(false); //设置标签三为不可见
            i++;
            try {
                Thread.sleep(15000); //休眠
                _gui.jl_3.setVisible(true);//重新设置标签三为可见
            } catch (InterruptedException ie) {
                System.out.print(ie.getMessage());
            }
        }

    }
}

class LabelThread_4 extends Thread {// 标签四线程类
    Gui _gui;

    public LabelThread_4(Gui gui){
        _gui = gui;
    }
    public void run(Window jl_4) {

        int i = 0;
        while (i < 30) {//循环30次
            _gui.jl_4.setVisible(false); //设置标签四为不可见
            i++;
            try {
                Thread.sleep(20000); //休眠
                _gui.jl_4.setVisible(true);//重新设置标签四为可见
            } catch (InterruptedException ie) {
                System.out.print(ie.getMessage());
            }
        }
    }
}
