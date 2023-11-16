package main.Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IndepClassListener extends JFrame {
    public IndepClassListener(){
        setTitle("독립 클래스 Event Listener");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton jb = new JButton("action");
        jb.addActionListener(new MyActionListener());
        c.add(jb);

        setSize(350,150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new IndepClassListener();
    }
}

class MyActionListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
        JButton b =(JButton)e.getSource();
        if(b.getText().equals("action")){
            b.setText("액션");
        }
        else{
            b.setText("action");
        }
    }
}
