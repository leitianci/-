package 草稿._1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//继承自JFrame类，实现ActionListener接口
public class experiment_1 extends JFrame implements ActionListener {

    private JPanel jp = new JPanel();//面板

    JRadioButton jrb1 = new JRadioButton("男");//单选按钮
    JRadioButton jrb2 = new JRadioButton("女");
    private JRadioButton[] jrb = new JRadioButton[]{jrb1,jrb2};
    private ButtonGroup bg = new ButtonGroup();//按钮组

    JCheckBox jcb1 = new JCheckBox("篮球");//复选框
    JCheckBox jcb2 = new JCheckBox("网球");
    JCheckBox jcb3 = new JCheckBox("羽毛球");
    JCheckBox jcb4 = new JCheckBox("乒乓球");
    private JCheckBox[] jcb =new JCheckBox[]{jcb1,jcb2,jcb3,jcb4};//复选框的数组

    private JButton  jb = new JButton("清空");
    private JLabel[] jl = {new JLabel("性别："),new JLabel("喜欢的运动：")};//标签

    private JTextArea jt = new JTextArea();//文本域
    private JScrollPane js= new JScrollPane(jt);//滚动条
    public experiment_1()
    {
        jp.setLayout(null);//
        for(int i=0;i<2;i++)
        {
            jrb[i].setBounds(30+120*i,40,120,30);//
            jp.add(jrb[i]);
            jrb[i].addActionListener(this);//
            bg.add(jrb[i]);
            if(i>1)
                continue;
            jl[i].setBounds(20,20+50*i,200,30);
            jp.add(jl[i]);

        }

        jb.setBounds(380+120,200,100,20);
        jp.add(jb);
        jb.addActionListener(this);//


        for(int i=0;i<4;i++)
        {
            jcb[i].setBounds(30+120*i,100,120,30);
            jp.add(jcb[i]);
            jcb[i].addActionListener(this);

        }

        js.setBounds(120,150,500,50);
        jp.add(js);
        jt.setLineWrap(true);
        jt.setEditable(false);
        this.add(jp);
        this.setTitle("个人简历");
        this.setBounds(150,150,750,300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame的关闭
    }
    public void actionPerformed(ActionEvent e) {//

        if(e.getSource() == jrb1){//如果ActionEvent事件是-->"男"
            jt.append(jrb1.getText() + "\n");//
        }else if(e.getSource() == jrb2){
            jt.append(jrb2.getText() + "\n");
        }

        if(e.getSource() == jcb1){
            if(jcb1.isSelected()){
                jt.append(jcb1.getText() + "\n");
            }else{
                jt.append(jcb1.getText() + "被取消" + "\n");
            }
        }else if(e.getSource() == jcb2){
            if(jcb2.isSelected()){
                jt.append(jcb2.getText() + "\n");
            }else{
                jt.append(jcb2.getText() + "被取消" + "\n");
            }
        }else if(e.getSource() == jcb3){
            if(jcb3.isSelected()){
                jt.append(jcb3.getText() + "\n");
            }else{
                jt.append(jcb3.getText() + "被取消" + "\n");
            }
        }else if(e.getSource() == jcb4){
            if(jcb4.isSelected()){
                jt.append(jcb4.getText() + "\n");
            }else{
                jt.append(jcb4.getText() + "被取消" + "\n");
            }
        }

        if(e.getSource()==jb){//
            bg.clearSelection();
            for(int i=0;i<jcb.length;i++)
                jcb[i].setSelected(false);
            jt.setText("");
        }

    }
    public static void main(String args[])
    {
        new experiment_1();//调用构造方法
    }
}
