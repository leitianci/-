package 草稿._1;

import java.awt.event.*;

import javax.swing.*;

public class Vote extends JFrame implements ActionListener
{
    private JPanel jp = new JPanel();
    JRadioButton jrb1 = new JRadioButton("这个网站很好，很新颖！",true);
    JRadioButton jrb2 = new JRadioButton("这个网站很普通，太一般");
    JRadioButton jrb3 = new JRadioButton("这个网站很差，偶尔看一下");
    JRadioButton jrb4 = new JRadioButton("这个网站太差了，不来了");
    private JRadioButton[] jrb = new JRadioButton[]{jrb1,jrb2,jrb3,jrb4};
    private ButtonGroup bg = new ButtonGroup();
    JCheckBox jcb1 = new JCheckBox("界面比较漂亮");
    JCheckBox jcb2 = new JCheckBox("内容比较丰富");
    JCheckBox jcb3 = new JCheckBox("增值服务比较好");
    JCheckBox jcb4 = new JCheckBox("会员服务比较好");
    private JCheckBox[] jcb =new JCheckBox[]{jcb1,jcb2,jcb3,jcb4};
    private JButton [] jb = {new JButton("我要投票"),new JButton("我要重选")};
    private JLabel[] jl = {new JLabel("这个网站给你的印象是："),new JLabel("您认为本站哪里做的比较好"),new JLabel("您投票的内容是：")};
    private JTextArea jt = new JTextArea();
    private JScrollPane js= new JScrollPane(jt);
    public Vote()
    {
        jp.setLayout(null);
        for(int i=0;i<4;i++)
        {
            jrb[i].setBounds(30+170*i,40,170,30);
            jcb[i].setBounds(30+120*i,100,120,30);
            jp.add(jrb[i]);
            jp.add(jcb[i]);
            jcb[i].addActionListener(this);
            jrb[i].addActionListener(this);
            bg.add(jrb[i]);
            if(i>1)
                continue;
            jl[i].setBounds(20,20+50*i,200,30);
            jb[i].setBounds(380+120*i,200,100,20);
            jp.add(jl[i]);
            jp.add(jb[i]);
            jb[i].addActionListener(this);
        }
        jl[2].setBounds(20,150,120,30);
        jp.add(jl[2]);
        js.setBounds(120,150,500,50);
        jp.add(js);
        jt.setLineWrap(true);
        jt.setEditable(false);
        this.add(jp);
        this.setTitle("网站满意调查表");
        this.setBounds(150,150,750,300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent a)
    {
        if(a.getSource()==jb[1])
        {
            bg.clearSelection();
            for(int i=0;i<jcb.length;i++)
                jcb[i].setSelected(false);
            jt.setText("");
        }
        else
        {
            StringBuffer temp1 = new StringBuffer("你认为这个网站");
            StringBuffer temp2 = new StringBuffer("");
            for(int i=0;i<4;i++)
            {
                if(jrb[i].isSelected())
                    temp1.append(jrb[i].getText());
                if(jcb[i].isSelected())
                    temp2.append(jcb[i].getText()+",");
            }
            if(temp2.length()==0)
                jt.setText("请将两项调查都选择");
            else
            {
                temp1.append("你认为这个网站");
                temp1.append(temp2.substring(0,temp2.length()-1));
                jt.setText(temp1.toString());
            }
        }
    }
    public static void main(String args[])
    {
        new Vote();
    }
}
