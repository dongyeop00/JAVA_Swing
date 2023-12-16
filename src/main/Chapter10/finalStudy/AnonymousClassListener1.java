package main.Chapter10.finalStudy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousClassListener1 extends JFrame {
    public AnonymousClassListener1(){
        setTitle("익명 클래스");

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton b = new JButton("hello");
        c.add(b);

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JButton b = (JButton)e.getSource();
                if(b.getText().equals("hello")){
                    b.setText("dongyeop");
                    setTitle(b.getText());
                }
                else{
                    b.setText("hello");
                    setTitle(b.getText());
                }

            }
        });

        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AnonymousClassListener1();
    }
}
