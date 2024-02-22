package 草稿._1;


import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Introduce extends JFrame implements ActionListener{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     * @param args
     */
    private JButton but;
    private JButton but1;
    private JTextField field;
    private JComboBox<String> bo;
    private JCheckBox box;
    private JCheckBox box1;
    private JCheckBox box2;
    private JRadioButton b;
    private JRadioButton b1;
    private ButtonGroup group;
    private JTextArea area;
    public  Introduce(){
        this.setBounds(500, 200, 300, 450);
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        Container c=this.getContentPane();
        this.setTitle("简历");

        //姓名文本框
        JLabel label=new JLabel("姓名:");
        field=new JTextField(2);
        JPanel panel=new JPanel();
        panel.add(label);
        panel.add(field);
        c.add(panel);

        //下拉列表
        JLabel label1=new JLabel("省份:");
        bo=new JComboBox<String>();
        bo.addItem("陕西");
        bo.addItem("山西");
        bo.addItem("湖北");
        JPanel panel1=new JPanel();
        panel1.add(label1);
        panel1.add(bo);
        c.add(panel1);

        //多选
        JLabel label2=new JLabel("爱好:");
        box=new JCheckBox("体育");
        box1=new JCheckBox("上网");
        box2=new JCheckBox("看书");
        JPanel panel2=new JPanel();
        panel2.add(label2);
        panel2.add(box);
        panel2.add(box1);
        panel2.add(box2);
        c.add(panel2);

        //性别
        JLabel label3=new JLabel("性别:");
        b=new JRadioButton("男");
        b1=new JRadioButton("女");
        //在界面中添加一个新的层
        JPanel panel3=new JPanel();
        panel3.add(label3);
        panel3.add(b);
        panel3.add(b1);
        c.add(panel3);

        //让单选具有互斥能力
        group=new ButtonGroup();
        group.add(b);
        group.add(b1);

        //简历
        JLabel label4=new JLabel("简历:");
        area=new JTextArea(10,20);
        JPanel panel4=new JPanel();
        panel4.add(label4);
        panel4.add(area);
        c.add(panel4);

        but=new JButton("确定");
        but1=new JButton("取消");
        but.addActionListener(this);
        but1.addActionListener(this);
        JPanel panel5=new JPanel();
        panel5.add(but);
        panel5.add(but1);
        c.add(panel5);

        //设置字体
        label.setFont(new Font("隶书",Font.BOLD,16));
        label1.setFont(new Font("隶书",Font.BOLD,16));
        label2.setFont(new Font("隶书",Font.BOLD,16));
        label3.setFont(new Font("隶书",Font.BOLD,16));
        label4.setFont(new Font("隶书",Font.BOLD,16));

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==but){
            System.out.println("姓名:"+field.getText().trim());
            System.out.println("省份:"+bo.getSelectedItem().toString());
            String interest="爱好:";
            if(box.isSelected())
                interest+=box.getText();
            if(box1.isSelected())
                interest+=box1.getText();
            if(box2.isSelected())
                interest+=box2.getText();
            System.out.println(interest);
            if(b.isSelected()){
                System.out.println("性别:"+b.getText());
            }else if(b1.isSelected()){
                System.out.println("性别:女");
            }else{
                System.out.println("性别:"+b.getText());
            }

            System.out.println("简历:"+area.getText().trim());
        }

    }
    public static void main(String[] args) {
        new  Introduce().setVisible(true);
    }
}