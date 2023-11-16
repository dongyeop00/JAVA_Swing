package main.Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseAdapterEx extends JFrame {
    private JLabel a = new JLabel("Hello");

    public MouseAdapterEx(){
        setTitle("마우스 어댑터");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.addMouseListener(new MyMouseAdapter());

        c.setLayout(null);
        a.setSize(50,20);
        a.setLocation(30,30);
        c.add(a);

        setSize(250,250);
        setVisible(true);
    }

    class MyMouseAdapter extends MouseAdapter{
        public void mousePressed(MouseEvent e){
            int x = e.getX();
            int y = e.getY();
            a.setLocation(x,y);
        }
    }

    public static void main(String[] args) {
        new MouseAdapterEx();
    }
}
