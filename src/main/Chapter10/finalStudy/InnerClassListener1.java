package main.Chapter10.finalStudy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InnerClassListener1 extends JFrame {
    public InnerClassListener1(){
        setTitle("내부 클래스 작성");

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton b = new JButton("hello");
        b.addActionListener(new MyActionListener1() );
        c.add(b);

        setSize(300,300);
        setVisible(true);
    }

    private class MyActionListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e){
            JButton b = (JButton)e.getSource();
            if(b.getText().equals("hello")){
                b.setText("dongyeop");
            }
            else{
                b.setText("hello");
            }
            InnerClassListener1.this.setTitle(b.getText());
        }
    }

    public static void main(String[] args) {
        new InnerClassListener1();
    }
}
