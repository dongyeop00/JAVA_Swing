package main.Chapter09;

import javax.swing.*;
import java.awt.*;

public class LayoutNull extends JFrame {
    public LayoutNull(){
        setTitle("LayoutNull Test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        JLabel la = new JLabel("Hello Buttons~");
        la.setLocation(130,50);
        la.setSize(200,20);
        c.add(la);

        for(int i=1; i<10; i++){
            JButton b = new JButton(Integer.toString(i));
            b.setBounds(i*15,i*15,50,20);
            c.add(b);
        }

        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LayoutNull();
    }
}
