package experiment.experiment_2;


import javax.swing.*;
import java.awt.*;

public class FourLabel{
    public static void main(String[] args) throws InterruptedException {
        Gui gui = new Gui();

        Thread thread1 = new Thread(new LabelThread(gui,0));
        Thread thread2 = new Thread(new LabelThread(gui,1));
        Thread thread3 = new Thread(new LabelThread(gui,2));
        Thread thread4 = new Thread(new LabelThread(gui,3));

        thread1.start();
        thread1.join(1000);
        thread2.start();
        thread2.join(1000);
        thread3.start();
        thread3.join(1000);
        thread4.start();
        thread4.join(1000);
    }
}

class Gui{
    JFrame frame;
    JLabel[] labels = new JLabel[4];

    public Gui() {
        frame= new JFrame("使用线程让标签轮流显示");
        frame.setLayout(new GridLayout(4,1));

        for(int i = 0; i < 4;i++){
            labels[i] = new JLabel("标 签 " + (i + 1));
            labels[i].setVisible(false);
            frame.add(labels[i]);
        }

        frame.setSize(300,300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class LabelThread implements Runnable{
    Gui gui;
    int index;
    public LabelThread(Gui gui,int index){
        this.gui = gui;
        this.index = index;
    }

    synchronized public void run() {
        synchronized (this){
            while(true){
                gui.labels[index].setVisible(true);
                try {
                    Thread.sleep(1000);//当前标签线程可见
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                gui.labels[index].setVisible(false);
                try {
                    Thread.sleep(3000);//当前线程标签不可见
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}