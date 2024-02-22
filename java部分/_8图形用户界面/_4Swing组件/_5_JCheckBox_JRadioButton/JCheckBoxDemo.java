package java部分._8图形用户界面._4Swing组件._5_JCheckBox_JRadioButton;
import javax.swing.*;
import java.awt.event.*;

public class JCheckBoxDemo implements ItemListener{

    JFrame mainFrame;
    JPanel mainPanel;
    JCheckBox simpleCheckBox1;
    JCheckBox simpleCheckBox2;

    public JCheckBoxDemo(){
        mainFrame=new JFrame("JCheckBoxDemo");
        mainPanel=new JPanel();

        simpleCheckBox1=new JCheckBox("checkbox1");
        simpleCheckBox1.setMnemonic('1');//设置键盘上的助记符为‘1’，键盘上的快捷键
        simpleCheckBox1.addItemListener(this);//添加监听器

        simpleCheckBox2=new JCheckBox("checkbox2");
        simpleCheckBox2.setMnemonic('2');//设置键盘上的助记符为‘2’
        simpleCheckBox2.addItemListener(this);//添加监听器

        mainPanel.add(simpleCheckBox1);
        mainPanel.add(simpleCheckBox2);
        mainFrame.add(mainPanel);

        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        JCheckBox cb=(JCheckBox)e.getSource();
        if(cb==simpleCheckBox1){
            System.out.println("simpleCheckBox1");
        }else{
            System.out.println("simpleCheckBox2");
        }
    }

    public static void main(String[] args) {
        new JCheckBoxDemo();
    }
}
