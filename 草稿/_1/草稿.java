package 草稿._1;

import javax.swing.*;

public class 草稿 {
    JFrame mainFrame;
    JPanel panel1;
    JPanel panel2;


    JLabel label1;
    JLabel label2;
    JLabel label3;



    JRadioButton radioButton1;
    JRadioButton radioButton2;
    ButtonGroup buttonGroup;


    JCheckBox checkBox1;
    JCheckBox checkBox2;
    JCheckBox checkBox3;



    JTextArea textArea;


    public 草稿(){
        mainFrame=new JFrame("个人简历");
        panel1=new JPanel();
        panel2=new JPanel();

        label1=new JLabel("你好，");
        panel1.add(label1);


        label2=new JLabel("世界！");
        panel2.add(label2);




        mainFrame.add(panel1);
        mainFrame.add(panel2);

        mainFrame.setSize(300,300);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



    public static void main(String[] args) {
        new 草稿();
    }

}
