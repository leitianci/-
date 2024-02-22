package 草稿._2;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Biaoqian extends JFrame
{
    private JLabel b1;
    private JLabel b2;
    private JLabel b3;
    private JLabel b4;
    private JLabel[] labelArr;

    public Biaoqian()
    {
        super("窗口");
        setBounds(500, 250, 200, 200);
        b1 = new JLabel("标签1");
        b2 = new JLabel("标签2");
        b3 = new JLabel("标签3");
        b4 = new JLabel("标签4");
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        labelArr = new JLabel[] {b1, b2, b3, b4};
        setLayout(new GridLayout(4, 1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        Biaoqian biaoqian = new Biaoqian();
        biaoqian.shanShuo();
    }

    public void shanShuo()
    {
        for(int i = 1;i < 4;i++){
            labelArr[i].setVisible(false);
        }

        while (true)
        {
            for (int i = 0; i < 4; i++)
            {
                labelArr[i].setVisible(true);
                try
                {
                    Thread.sleep(1000);
                }
                catch (Exception e)
                {
// TODO: handle exception
                }
                labelArr[i].setVisible(false);
            }
        }
    }
}

