package main.Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AnonymousClassListener extends JFrame {
    public AnonymousClassListener(){
        setTitle("익명 클래스 Event Listener");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JButton jb = new JButton("action");
        c.add(jb);

        jb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton)e.getSource();
                if(b.getText().equals("action"))
                    b.setText("액션");
                else
                    b.setText("action");
                    setTitle(b.getText());
            }
        });

        setSize(350,150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AnonymousClassListener();
    }
}
