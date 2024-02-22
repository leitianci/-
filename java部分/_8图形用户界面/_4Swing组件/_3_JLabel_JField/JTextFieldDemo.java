package java部分._8图形用户界面._4Swing组件._3_JLabel_JField;

import javax.swing.*;

public class JTextFieldDemo {
    JFrame mainFrame;
    JTextField simpleTextField;

    public JTextFieldDemo() {
        mainFrame=new JFrame("JTextField");
        simpleTextField=new JTextField(20);
        mainFrame.add(simpleTextField);

        simpleTextField.addActionListener(e -> System.out.println(simpleTextField.getText()));

        mainFrame.setSize(300,300);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new JTextFieldDemo();
    }

}
