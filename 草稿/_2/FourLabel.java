package 草稿._2;

import java.awt.*;

import javax.swing.*;

public class FourLabel {//这是把郑建海同学代码修改后能正常运行的
    public static void main(String[] args) {

        Frame f=new Frame();
        f.Set();

        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        Thread3 t3=new Thread3();
        Thread4 t4=new Thread4();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
class  Frame extends Thread
{

    static int sign=1;
    static JLabel l1 = new JLabel("线 程 1");
    static JLabel l2 = new JLabel("线 程 2");
    static JLabel l3 = new JLabel("线 程 3");
    static JLabel l4 = new JLabel("线 程 4");
    JFrame frame = new JFrame("四个标签轮流显示");

    public  void Set()
    {
        frame.setSize(300, 300);
        frame.setLayout(new GridLayout(4,1));//网格布局，4行1列
        frame.setLocationRelativeTo(null);//在屏幕正中央
        frame.setVisible(true);
        frame.getContentPane().add(l1);
        frame.getContentPane().add(l2);
        frame.getContentPane().add(l3);
        frame.getContentPane().add(l4);


        l1.setVisible(false);
        l2.setVisible(false);
        l3.setVisible(false);
        l4.setVisible(false);

    }
    public static void stateChange(JLabel l)
    {
        for(;;)
        {
            if(sign==5) sign=1;

            if(sign==1)
            {
                l.setVisible(true);
                try {Thread.sleep(1000);}
                catch (InterruptedException e) {e.printStackTrace();}
                l.setVisible(false);
                sign++;

            }
            if(sign==2)
            {
                l2.setVisible(true);
                try {Thread.sleep(1000);}
                catch (InterruptedException e) {e.printStackTrace();}
                l2.setVisible(false);
                sign++;
            }
            if(sign==3)
            {
                l3.setVisible(true);
                try {Thread.sleep(1000);}
                catch (InterruptedException e) {e.printStackTrace();}
                l3.setVisible(false);
                sign++;
            }
            if(sign==4)
            {
                l4.setVisible(true);
                try {Thread.sleep(1000);}
                catch (InterruptedException e) {e.printStackTrace();}
                l4.setVisible(false);
                sign++;
            }
        }
    }



}
class Thread1 extends Frame
{
    public void run()
    {
        if(sign==1)
            stateChange(l1);
    }
}

class Thread2 extends Frame
{
    public void run()
    {
        if(sign==2)
            stateChange(l2);
    }
}

class Thread3 extends Frame
{
    synchronized public void run()
    {
        if(sign==3)
            stateChange(l3);
    }
}

class Thread4 extends Frame
{
    synchronized public void run()
    {
        if(sign==4)
            stateChange(l4);
    }
}

