package 草稿._2;

import javax.swing.*;
import java.awt.*;

public class FlashingText extends JApplet implements Runnable {
    private JLabel jlblText = new JLabel("Welcome",JLabel.CENTER);
    public FlashingText()  {
        add(jlblText);
        new Thread(this).start();
    }

/*    public static void main(String[] args) {
    }*/

    @Override
    public void run() {
        try{
            while (true){
                if (jlblText.getText()==null)
                    jlblText.setText("Welcome");
                else
                    jlblText.setText(null);

                Thread.sleep(200);
            }
        }catch (InterruptedException ex){

        }
    }
}

