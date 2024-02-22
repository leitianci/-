package java部分._8图形用户界面._4Swing组件._3_JLabel_JField;


import java.awt.*;
import javax.swing.*;//注意，这里是javax,
import java.awt.event.*;
import java.io.*;

public class JLabelDemo {
    JFrame mainFrame;
    JLabel simpleLabel;
    public JLabelDemo(){
        mainFrame=new JFrame("JLabelDemo");
        simpleLabel=new JLabel("<html><a href=aaa>百度搜索</a></html>");
        simpleLabel.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                try{
                    //调用服务器命令脚本来执行功能需要
                    Runtime.getRuntime().exec("cmd/c start http://www.baidu.com");

                }catch(IOException ee){
                    //在控制台打印程序出错的位置和原因
                    ee.printStackTrace();
                }
            }
        });

        simpleLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));//设置手型鼠标
        mainFrame.getContentPane().add(simpleLabel);//JDK1.5之前，JFrame要先获取内容面板，再添加内容
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        mainFrame.pack();//使窗口根据添加了的组件自动调整大小
        mainFrame.setSize(300,300);
        mainFrame.setLocationRelativeTo(null);//指定窗口相对位置，null时置于屏幕中央
        mainFrame.setVisible(true);
    }

    public static void main(String[] args){
        new JLabelDemo();
    }

}
