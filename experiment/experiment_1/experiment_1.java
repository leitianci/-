package experiment.experiment_1;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class experiment_1 implements ItemListener {
    JFrame mainFrame;
    JPanel panel;

    JLabel label1;
    JLabel label2;
    JLabel label3;

    JTextField textField;

    JRadioButton radioButton1;
    JRadioButton radioButton2;
    ButtonGroup buttonGroup;

    JCheckBox checkBox1;
    JCheckBox checkBox2;
    JCheckBox checkBox3;

    JButton button1;
    JButton button2;

    JTextArea textArea;


    public experiment_1(){
        mainFrame=new JFrame("个人简历");
        panel=new JPanel();

        label1=new JLabel("姓名：");
        label1.setBounds(30,40,120,30);
        textField=new JTextField(10);
        panel.add(label1);
        panel.add(textField);

        label2=new JLabel("性别:");
        label2.setBounds(100,100,120,30);
        panel.add(label2);
        radioButton1=new JRadioButton("男");
        radioButton2=new JRadioButton("女");
        radioButton1.addItemListener(this);
        radioButton2.addItemListener(this);
        buttonGroup=new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        panel.add(radioButton1);
        panel.add(radioButton2);


        label3=new JLabel("兴趣爱好:");
        panel.add(label3);
        checkBox1=new JCheckBox("篮球");
        checkBox2=new JCheckBox("羽毛球");
        checkBox3=new JCheckBox("乒乓球");
        checkBox1.addItemListener(this);
        checkBox2.addItemListener(this);
        checkBox3.addItemListener(this);
        panel.add(checkBox1);
        panel.add(checkBox2);
        panel.add(checkBox3);

        button1=new JButton("提交");
        button2=new JButton("清空");
        panel.add(button1);
        panel.add(button2);
        button1.addActionListener(e -> {//使用lambda，替换匿名类
            String sex;
            String[] hobby = new String[3];
            if (radioButton1.isSelected()) {
                sex = "男";
            } else {
                sex = "女";
            }
            if (checkBox1.isSelected()) {
                hobby[0] = "篮球 ";
            } else {
                hobby[0] = " ";
            }
            if (checkBox2.isSelected()) {
                hobby[1] = "羽毛球 ";
            } else {
                hobby[1] = " ";
            }
            if (checkBox3.isSelected()) {
                hobby[2] = "乒乓球 ";
            } else {
                hobby[2] = " ";
            }

            textArea.setText("姓名：" + textField.getText() + "\n"
                    + "性别：" + sex + "\n"
                    + "兴趣爱好：" + hobby[0] + hobby[1] + hobby[2]);

        });
        button2.addActionListener(e -> textArea.setText(""));
        //Statement lambda  is replaced with expression lambda


        textArea=new JTextArea(5,30);
        panel.add(textArea);

        mainFrame.add(panel);

        mainFrame.setSize(600,200);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource() == radioButton1){
            if(radioButton1.isSelected()){
                textArea.setText(radioButton1.getText());
            }else{
                textArea.setText("");
            }
        }else if (e.getSource() == radioButton2){
            if(radioButton2.isSelected()){
                textArea.setText(radioButton2.getText());
            }else{
                textArea.setText("");
            }
        }else if(e.getSource() == checkBox1){
            if(checkBox1.isSelected()){
                textArea.setText(checkBox1.getText());
            }else{
                textArea.setText("取消选中篮球");
            }
        }else if(e.getSource() == checkBox2){
            if(checkBox2.isSelected()){
                textArea.setText(checkBox2.getText());
            }else{
                textArea.setText("取消选中羽毛球");
            }
        }else if(e.getSource() == checkBox3){
            if(checkBox3.isSelected()){
                textArea.setText(checkBox3.getText());
            }else{
                textArea.setText("取消选中乒乓球");
            }
        }
    }

    public static void main(String[] args) {
        new experiment_1();
    }
}
