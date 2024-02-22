package 草稿._1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Drive {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JPanel panel_output=new JPanel();
        frame.setSize(650, 200);
        frame.setLayout(new GridLayout(0, 1));

        frame.add(panel);
        JLabel username =new JLabel("姓名");
        JTextField name =new JTextField(10);

        JLabel usersex =new JLabel("性别");
        ButtonGroup sex = new ButtonGroup();
        JRadioButton man = new JRadioButton("男",true);
        JRadioButton girl = new JRadioButton("女");
        sex.add(man);
        sex.add(girl);

        JLabel lbl_hobby =new JLabel("爱好：");
        JCheckBox singsong = new JCheckBox("唱歌");
        JCheckBox pingpang = new JCheckBox("乒乓球");
        JCheckBox basktball = new JCheckBox("篮球");
        JCheckBox dance = new JCheckBox("跳舞");
        JCheckBox football = new JCheckBox("足球");
        JCheckBox[] hobby = {singsong, pingpang, basktball,dance,football};

        JTextArea outputarea =new JTextArea(3,30);
        JButton service = new JButton("保存");
        JButton user = new JButton("退出");
        JButton cleanup = new JButton("清空面板");
        panel_output.add(outputarea);

        panel.add(username);
        panel.add(name);
        panel.add(usersex);
        panel.add(man);
        panel.add(girl);
        panel.add(lbl_hobby);
        panel.setLayout(new FlowLayout());
        for (int i =0;i<5;i++)
        {
            panel.add(hobby[i]);
        }
        panel.add(service);
        panel.add(cleanup);
        panel.add(user);
        panel.add(outputarea);

        class listener implements ActionListener {
            public void actionPerformed (ActionEvent sb){
                String sex = null;
                Object sourece = sb.getSource();
                if (sourece == service)
                {
                    if (man.isSelected()) {
                        sex = "男";
                    } else {
                        sex = "女";
                    }
                    String hobby = "爱好： ";
                    if (singsong.isSelected()) {
                        hobby += "唱歌      ";
                    }
                    if (pingpang.isSelected()) {
                        hobby += "乒乓球      ";
                    }
                    if (basktball.isSelected()) {
                        hobby += "篮球     ";
                    }
                    if (dance.isSelected()){
                        hobby += "跳舞     ";
                    }
                    if(football.isSelected()){
                        hobby += "足球      ";
                    }
                    outputarea.append("姓名: "+name.getText()+"\t");
                    outputarea.append("性别：" + sex + "   \n");
                    outputarea.append( hobby + "  \n");
                }
                else if (sourece == cleanup)
                {
                    outputarea.setText("");
                } else if (sourece == user)
                {
                    frame.setVisible(false);
                }
            }
        }
        listener sb_2 = new listener();
        service.addActionListener(sb_2);
        cleanup.addActionListener(sb_2);
        user.addActionListener(sb_2);
        frame.setVisible(true);
    }

}
