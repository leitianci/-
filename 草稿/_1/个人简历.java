/*
package 草稿;

import java.awt.*;
import  java.awt.event.*;
import javax.swing.*;
import java.awt.FlowLayout;

//import org.omg.CORBA.PUBLIC_MEMBER;
//import org.omg.CORBA.Request;
public class 个人简历 implements ItemListener{
    JCheckBox chang ;
    JCheckBox tiao ;
    JCheckBox ping ;
    JCheckBox lan ;
    JCheckBox zu ;
    JCheckBox yueqi ;
    JCheckBox biao ;
    JRadioButton  male ;
    JRadioButton  female ;

    JTextField jtt_name;





    public static void main(String[] args) {

        JFrame frame =new JFrame();
        frame.setTitle("xlm���˼���");
        frame.setSize(600,1000);

        JPanel panel_up=new JPanel();
        JPanel panel_bottom=new JPanel();

        JPanel panel_1=new JPanel();
        JPanel panel_2=new JPanel();
        JPanel panel_3=new JPanel();
        JPanel panel_4=new JPanel();
        JPanel panel_5=new JPanel();
        JPanel panel_6=new JPanel();
        JPanel panel_7=new JPanel();
        JPanel panel_8=new JPanel();
        JPanel panel_9=new JPanel();
        JPanel panel_10=new JPanel();
        JPanel panel_jieguo=new JPanel();
        frame.setLayout(new GridLayout(3,1));
        frame.add(panel_1);
        frame.add(panel_up);
        frame.add(panel_bottom);
        panel_bottom.setLayout(new GridLayout(3,1));
        panel_up.setLayout(new GridLayout(3,1));

//��������
        JLabel lbl_jianli =new JLabel("                 ���˼���");
        lbl_jianli.setFont(new Font("����",Font.BOLD,25));
        JLabel lbl_username =new JLabel("����");
        JTextField jtt_name =new JTextField(10);
        JLabel lbl_userage =new JLabel("�Ա�");

//��ѡ�Ա�ť

        ButtonGroup bg=new ButtonGroup();
        JRadioButton  male = new JRadioButton("��", true);
        JRadioButton  female = new JRadioButton("Ů");
        bg.add(male);
        bg.add(female);
        JLabel lbl_shengri =new JLabel("���գ�");
        JLabel lbl_shengri1 =new JLabel("��  ");
        JLabel lbl_shengri2 =new JLabel("��  ");
        JLabel lbl_shengri3 =new JLabel("��  ");

//����ʹ�������б�

        String nian[] = {"1997","1998","1999","2000","2001","2002"};
        JComboBox cb1 = new JComboBox(nian);
        String yue[] = {"1","2","3","4","5","6","7","8","9","10","11","12"};
        JComboBox cb2 = new JComboBox(yue);
        String ri[] = {"1","2","3","4","5","6","7","8","9","10",
        "11","12","13","14","15","16","17","18","19","20",
        "21","22","23","24","25","26","27","28","29","30","31"};

        JComboBox cb3 = new JComboBox(ri);
        JLabel lbl_nianling =new JLabel("����");
        JTextField jtt_nianling =new JTextField(10);
        JLabel lbl_zhuzhi =new JLabel("סַ");
        JTextField jtt_zhuzhi =new JTextField(20);
//������ò�����б�
        JLabel lbl_zhengzhi =new JLabel("������ò");
        String zheng[] = {"������Ա","��Ա"};
        JComboBox cb_zheng = new JComboBox(zheng);
        //JTextField jtt_zhengzhi =new JTextField(10);

//��ѧ�γ��б��
        JLabel lbl_kecheng =new JLabel("��ѧ�γ�");
        String[] coursesNames = {"Java�������","���ݽṹ","c����"};
        JList course = new JList(coursesNames);
        JLabel lbl_zhuanye =new JLabel("��ѧרҵ");
        JTextField jtt_zhuanye =new JTextField(20);
        JLabel lbl_aihao =new JLabel("���ã�");
//����ʹ�ø�ѡ��

        JCheckBox chang =  new JCheckBox("����");
        JCheckBox tiao = new JCheckBox("����");
        JCheckBox ping = new JCheckBox("ƹ����");
        JCheckBox lan = new JCheckBox("����");
        JCheckBox zu  = new JCheckBox("����");
        JCheckBox yueqi = new JCheckBox("����");
        JCheckBox biao = new JCheckBox("����");
        JCheckBox[] aihaofu={chang,tiao,ping,lan,zu,yueqi,biao};
        //JTextField jtt_aihao =new JTextField(10);
        JLabel lbl_yuanxiao =new JLabel("��ҵԺУ");
        JTextField jtt_yuanxiao =new JTextField(20);
        JLabel lbl_jianjie =new JLabel("���");
        JTextField jtt_jianjie =new JTextField(50);
        JTextArea txt_jianjie =new JTextArea(8,35);///�����ı�������Ҫȷ���ı����Ĵ�С

        JButton btn_baocun=new JButton("����");
        JButton btn_tuichu=new JButton("�˳�");
        JButton btn_qingkong=new JButton("���");
        panel_1.setLayout(new GridLayout(4,1));
        panel_1.add(lbl_jianli);

        //panel_2 ��Ĭ��������
        panel_2.add(lbl_username);
        panel_2.add(jtt_name);
        panel_2.add(lbl_userage);
        //panel_2.add(jtt_age);
        panel_2.add(male);
        panel_2.add(female);
        //panel_2.add(bg);
        panel_1.add(panel_2);

//����������ʵ��

        panel_3.add(lbl_shengri);
        panel_3.add(cb1);
        panel_3.add(lbl_shengri1);
        panel_3.add(cb2);
        panel_3.add(lbl_shengri2);
        panel_3.add(cb3);
        panel_3.add(lbl_shengri3);
        panel_3.add(lbl_nianling);
        panel_3.add(jtt_nianling);
        panel_1.add(panel_3);
        panel_4.setLayout(new FlowLayout());
        panel_4.add(lbl_zhuzhi);
        panel_4.add(jtt_zhuzhi);
        panel_1.add(panel_4);
        panel_5.setLayout(new FlowLayout());
        panel_5.add(lbl_zhengzhi);
        panel_5.add(cb_zheng);
        panel_5.setLayout(new FlowLayout());
        panel_5.add(lbl_kecheng);
        panel_5.add(course);
        panel_up.add(panel_5);
        panel_6.setLayout(new FlowLayout());
        panel_6.add(lbl_zhuanye);
        panel_6.add(jtt_zhuanye);
        panel_up.add(panel_6);
        panel_7.setLayout(new FlowLayout());
        panel_7.add(lbl_aihao);
        for (int i = 0; i<7;i++)
        {
        panel_7.add(aihaofu[i]);
        }
        panel_up.add(panel_7);
        panel_8.setLayout(new FlowLayout());
        panel_8.add(lbl_yuanxiao);
        panel_8.add(jtt_yuanxiao);
        panel_up.add(panel_8);
        panel_9.setLayout(new FlowLayout());
        panel_9.add(lbl_jianjie);
        panel_9.add(jtt_jianjie);
        panel_bottom.add(panel_9);
        panel_jieguo.add(txt_jianjie);
        panel_bottom.add(panel_jieguo);
        panel_10.setLayout(new FlowLayout());
        panel_10.add(btn_baocun);
        panel_10.add(btn_tuichu);
        panel_10.add(btn_qingkong);
        panel_bottom.add(panel_10);
//������ť�¼�

class jianti implements ActionListener{//����������
    public void actionPerformed(ActionEvent e) {
        //��ȡ�¼�Դ
        String sex = null;
        Object source=e.getSource();
        //�ж��¼�Դ��������Ӧ�Ĵ���
        if(source==btn_baocun)//����������source==btn_baocun
        {
            //panel_1.setBackground(Color.red);
//��ѡ��ť�ж�����ȡ�Ա�

            if (male.isSelected())
            {
                sex = "��";
            }
            else
            {
                sex = "Ů";
            }
//��ȡ������

            String c1,c2,c3;
            c1=(String)cb1.getSelectedItem();
            c2=(String)cb2.getSelectedItem();
            c3=(String)cb3.getSelectedItem();
//��ѡ�򣬻�ȡ����
            String aihao = "���ã�";
            if(chang.isSelected())
            {
                aihao += "����";
            }
            if(tiao.isSelected())
            {
                aihao = aihao + "����";
            }
            if(ping.isSelected())
            {
                aihao = aihao + "ƹ����";
            }
            if(lan.isSelected())
            {
                aihao = aihao + "����";
            }
            if(zu.isSelected())
            {
                aihao = aihao + "����";
            }
            if(yueqi.isSelected())
            {
                aihao = aihao + "����";
            }
            if(biao.isSelected())
            {
                aihao = aihao + "����";
            }
//������ò
            String mianmao;
            mianmao=(String)cb_zheng.getSelectedItem();
            txt_jianjie.append("������"+jtt_name.getText()+"  ");//ֱ�Ӽӵ�����
            txt_jianjie.append("�Ա�"+sex+"   ");//ֱ�Ӽӵ�����
            txt_jianjie.append("���գ�"+c1+"��"+c2+"��"+c3+"��    ");//ֱ�Ӽӵ�����
            txt_jianjie.append("���䣺"+jtt_nianling.getText()+" \n");//ֱ�Ӽӵ�����
            txt_jianjie.append("סַ��"+jtt_zhuzhi.getText()+"    ");//ֱ�Ӽӵ�����
            txt_jianjie.append("������ò:"+mianmao+"  \n");//ֱ�Ӽӵ�����
            txt_jianjie.append("��ѧ�γ�:"+(String)course.getSelectedValue()+"    ");//ֱ�Ӽӵ�����
            txt_jianjie.append("��ѧרҵ:"+jtt_zhuanye.getText()+" \n");//ֱ�Ӽӵ�����
            //����
            txt_jianjie.append(aihao+"  \n");//ֱ�Ӽӵ�����
            txt_jianjie.append("��ҵԺУ:"+jtt_yuanxiao.getText()+"  \n");//ֱ�Ӽӵ�����
            txt_jianjie.append("���"+jtt_jianjie.getText()+"  ");//ֱ�Ӽӵ�����
        }
        else if(source==btn_qingkong)//���
        {
            txt_jianjie.setText("");
        }
        else if(source == btn_tuichu)//�û�
        {
            frame.setVisible(false);//��ʾ
        }
    }
}
    //��������
    jianti tt = new jianti();
              btn_baocun.addActionListener(tt);//������������,������
                      btn_qingkong.addActionListener(tt);//�˳�
                      btn_tuichu.addActionListener(tt);
                      frame.setVisible(true);//��ʾ
                      }
    @ Override
    public void itemStateChanged(ItemEvent e) {

        if(e.getSource() == male){
            if(male.isSelected()){
                jtt_name.setText("性别：" + male.getText());
            }else{
                jtt_name.setText("性别选择被取消");
            }
        }else if(e.getSource() == female){
            if(female.isSelected()){
                jtt_name.setText("性别：" + female.getText());
            }else{
                jtt_name.setText("性别选择被取消");
            }
        }else if(e.getSource() == chang){

            if(female.isSelected()){
                jtt_name.setText("爱好：" + chang.getText());
            }else{
                jtt_name.setText("爱好<"+ e.getSource().get +">选择被取消");
            }
        }






    }
}
*/
