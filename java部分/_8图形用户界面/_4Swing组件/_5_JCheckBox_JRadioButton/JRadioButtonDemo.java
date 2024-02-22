package java部分._8图形用户界面._4Swing组件._5_JCheckBox_JRadioButton;
import javax.swing.*;
import java.awt.event.*;

public class JRadioButtonDemo implements ItemListener{
    JFrame mainFrame;
    JPanel mainPanel;
    ButtonGroup buttonGroup;
    JRadioButton simpleRadioButton1;
    JRadioButton simpleRadioButton2;

    public JRadioButtonDemo() {
        mainFrame=new JFrame("JRadioButtonDemo");
        mainPanel=new JPanel();

        simpleRadioButton1=new JRadioButton("RadioBUtton1");
        simpleRadioButton1.setMnemonic('1');//设置键盘上的
        simpleRadioButton1.addItemListener(this);


        simpleRadioButton2=new JRadioButton("RadioBUtton2");
        simpleRadioButton2.setMnemonic('2');
        simpleRadioButton2.addItemListener(this);

        buttonGroup=new ButtonGroup();//创建RadioButton按钮组
        buttonGroup.add(simpleRadioButton1);
        buttonGroup.add(simpleRadioButton2);

        mainPanel.add(simpleRadioButton1);
        mainPanel.add(simpleRadioButton2);
        mainFrame.add(mainPanel);

        mainFrame.setSize(300,300);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    @Override
    public void itemStateChanged(ItemEvent e) {
        JRadioButton cb=(JRadioButton)e.getSource();
        if(cb==simpleRadioButton1){
            System.out.println("simpleRadioButton1");
        }else{
            System.out.println("simpleRadioButton2");
        }
    }

    public static void main(String[] args) {
        new JRadioButtonDemo();
    }
}
