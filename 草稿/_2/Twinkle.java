package 草稿._2;

import java.awt.*;


import javax.swing.*;


import java.awt.event.*;
public class Twinkle {
    private JPanel jp;
    private JFrame jf;
    private JLabel[] jl;
    boolean b;
    public void see(boolean a)
    {
        if(a)
            for(int i=0;i<4;i++)
                jl[i].setVisible(true);
        else
            for(int i=0;i<4;i++)
                jl[i].setVisible(false);

    }
    public  void go()
    {
        jl=new JLabel[4];
        jp=new JPanel();
        jf=new JFrame();
        jf.add(jp);
        for(int i=0;i<4;i++)
        {jl[i]=new JLabel(String.valueOf(i));
            jp.add(jl[i]);}
        jp.setSize(100, 300);
        jf.setVisible(true);
        while(true)
        {
            try
            {
                Thread.sleep(100);
                b=true;
                see(b);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }


            try
            {
                Thread.sleep(1000);
                b=false;
                see(b);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[]args)
    {
        Twinkle T=new Twinkle();
        T.go();
    }
}

