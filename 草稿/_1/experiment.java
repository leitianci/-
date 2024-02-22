package 草稿._1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/*
 * 在这个代码中，添加监听器的组件有三种，单选按钮（性别），复选按钮（兴趣爱好），按钮（就是“确定”和“清空”那两个）
 * 单选按钮，复选按钮，这两类使用ItemListener监听器，通过实现ItemListener接口，重写了itemStateChanged（）这个方法
 * 按钮，使用ActionListener监听器，使用匿名内部类对实现监听的方法重写
 * */
public class experiment implements ItemListener{
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



    public experiment(){
        mainFrame=new JFrame("个人简历");
        panel=new JPanel();

        label1=new JLabel("姓名：");
        textField=new JTextField(10);
        panel.add(label1);
        panel.add(textField);

        label2=new JLabel("性别:");
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
        checkBox1=new JCheckBox("读书");
        checkBox2=new JCheckBox("旅游");
        checkBox3=new JCheckBox("运动");
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


        //对“提交”按钮添加ActionListener监听器，
        button1.addActionListener(new ActionListener() {//使用匿名内部类
            @Override
            public void actionPerformed(ActionEvent e) {
                String sex;
                String[] hobby = new String[3];
                if (radioButton1.isSelected()) {
                    sex = "男";
                } else {
                    sex = "女";
                }
                if (checkBox1.isSelected()) {
                    hobby[0] = "读书 ";
                } else {
                    hobby[0] = " ";
                }
                if (checkBox2.isSelected()) {
                    hobby[1] = "旅游 ";
                } else {
                    hobby[1] = " ";
                }
                if (checkBox3.isSelected()) {
                    hobby[2] = "运动 ";
                } else {
                    hobby[2] = " ";
                }

                textArea.setText("姓名：" + textField.getText() + "\n"
                        + "性别：" + sex + "\n"
                        + "兴趣爱好：" + hobby[0] + hobby[1] + hobby[2]);

            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
            }
        });

        textArea=new JTextArea(5,40);
        panel.add(new JScrollPane(textArea));

        mainFrame.add(panel);

        mainFrame.setSize(550,200);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource() == radioButton1){
            if(radioButton1.isSelected()){
                textArea.append(radioButton1.getText()+"\n");//radioButton1被选中，在文本域上显示
            }else{
                textArea.append(""+"\n");//否则，文本域置空
            }
        }else if (e.getSource() == radioButton2){
            if(radioButton2.isSelected()){
                textArea.append(radioButton2.getText()+"\n");
            }else{
                textArea.append(" ");
            }
        }else if(e.getSource() == checkBox1){
            if(checkBox1.isSelected()){
                textArea.append(checkBox1.getText()+"\n");//checkBox1，在文本域上追加显示
            }else{
                textArea.append("取消选中读书"+"\n");//否则追加显示"取消选中读书"
            }
        }else if(e.getSource() == checkBox2){
            if(checkBox2.isSelected()){
                textArea.append(checkBox2.getText()+"\n");
            }else{
                textArea.append("取消选中旅游"+"\n");
            }
        }else if(e.getSource() == checkBox3){
            if(checkBox3.isSelected()){
                textArea.append(checkBox3.getText()+"\n");
            }else{
                textArea.append("取消选中运动"+"\n");
            }
        }
    }

    public static void main(String[] args) {
        new experiment();
    }
}
