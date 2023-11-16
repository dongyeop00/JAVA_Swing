package main.Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseListenerEx extends JFrame {
    private JLabel a = new JLabel("hello");
    public MouseListenerEx(){
        setTitle("마우스 리스너");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.addMouseListener(new MyMouseListener());

        c.setLayout(null);
        a.setSize(50,20);
        a.setLocation(30,30);
        c.add(a);

        setSize(250,250);
        setVisible(true);
    }

    class MyMouseListener implements MouseListener {
        public void mousePressed(MouseEvent e){
            int x = e.getX();
            int y = e.getY();
            a.setLocation(x,y);
        }

        public void mouseReleased(MouseEvent e){}
        public void mouseClicked(MouseEvent e){}
        public void mouseEntered(MouseEvent e){}
        public void mouseExited(MouseEvent e){}
    }

    public static void main(String[] args) {
        new MouseListenerEx();
    }
}
