package main.Chapter10.finalStudy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IndepClassListener1 extends JFrame {
    public IndepClassListener1(){
        setTitle("독립 클래스로 작성하기");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JButton b = new JButton("Hello");
        b.addActionListener(new MyActionListener());
        c.add(b);

        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new IndepClassListener1();
    }
}

class MyActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e){
        JButton b = (JButton)e.getSource();
        if(b.getText().equals("Hello")){
            b.setText("dongyeop");
        }
        else{
            b.setText("yeop");
        }
    }
}
