package 草稿._2;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;
class introduce extends JFrame
{
    public introduce()
    {
        JFrame a=new JFrame();
        a.setLayout(new FlowLayout());

        a.setTitle("个人简历");
        a.setSize(400,300);
        a.setLocation(300,240);
        JLabel c=new JLabel("姓名:");
        a.add(c);
        JLabel d=new JLabel("陈龑");
        a.add(d);
        JRadioButton radio1, radio2;
        a.add(new JLabel("性别:"));
        ButtonGroup group = new ButtonGroup();  //单选按钮所在的组
        radio1 = new JRadioButton("男");    //创建单选按钮
        radio2 = new JRadioButton("女");
        group.add(radio1);
        group.add(radio2);
        a.add(radio1);
        a.add(radio2);

        a.add(new JLabel("民族:"));     //创建下拉框
        String proList[] = { "汉族","回族","藏族","满族" ,"其他"};
        JComboBox comboBox;
        Container conPane = getContentPane();
        comboBox = new JComboBox(proList);
        comboBox.setEditable(true);
        conPane.add(comboBox);
        a.add(conPane);

        JCheckBox checkBox1, checkBox2, checkBox3,checkBox4;   //创建选择框
        a.add(new JLabel("    爱好:   "));
        checkBox1 = new JCheckBox(" 旅游 ");
        checkBox2 = new JCheckBox(" 看电影 ");
        checkBox3 = new JCheckBox(" 听音乐 ");
        checkBox4 = new JCheckBox(" 读书  ");
        a.add(checkBox1);
        a.add(checkBox2);
        a.add(checkBox3);
        a.add(checkBox4);

        JCheckBox checkBox5, checkBox6, checkBox7,checkBox8;   //创建选择框
        a.add(new JLabel("    擅长语言:   "));
        checkBox5 = new JCheckBox("  Java ");
        checkBox6 = new JCheckBox("  C  ");
        checkBox7 = new JCheckBox(" Python ");
        checkBox8 = new JCheckBox(" C++  ");
        a.add(checkBox5);
        a.add(checkBox6);
        a.add(checkBox7);
        a.add(checkBox8);

        JCheckBox checkBox9, checkBox10, checkBox11,checkBox12;   //创建选择框
        a.add(new JLabel("    平均绩点（GPA）:   "));
        checkBox9 = new JCheckBox("  1-2 ");
        checkBox10 = new JCheckBox("  2-3  ");
        checkBox11 = new JCheckBox("  3-4 ");
        checkBox12 = new JCheckBox("  4-5  ");
        a.add(checkBox9);
        a.add(checkBox10);
        a.add(checkBox11);
        a.add(checkBox12);

        a.add(new JLabel("   专业:   "));//创建带滚动条的文本区
        String str[]= {"软件工程","计算机科学与技术","物联网","网络工程"};
        JList list = new JList(str);
        list.setVisibleRowCount(3);//设置可视的行数
        a.add(new JScrollPane(list));  //添加带有滚动条件的文本区
        a.setVisible(true);
    }

    public static void main(String[] args)
    {
        new introduce();
    }
}

