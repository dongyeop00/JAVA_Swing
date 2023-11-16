package main.Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InnerClassListener extends JFrame {
    public InnerClassListener(){
        setTitle("내부 클래스 Event Listener");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton jb = new JButton("action");
        jb.addActionListener(new MyActionListener());
        c.add(jb);

    }
    private class MyActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            JButton b = (JButton)e.getSource();
            if(b.getText().equals("action"))
                b.setText("액션");
            else
                b.setText("action");

            //InnerClassListener의 멤버나 JFrame의 멤버를 호출할 수 있음
            InnerClassListener.this.setTitle(b.getText());
        }
    }

    public static void main(String[] args) {
        new IndepClassListener();
    }
}
