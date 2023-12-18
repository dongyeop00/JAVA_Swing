package main.Chapter12;

import javax.swing.*;
import java.awt.*;

public class GraphicsDrawStringEx extends JFrame {
    private MyPanel panel = new MyPanel();

    public GraphicsDrawStringEx(){
        setTitle("스트링 그리기");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(panel);
        setSize(250,200);
        setVisible(true);
    }

    class MyPanel extends JPanel{
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawLine(5,0,40,40);
        }
    }

    public static void main(String[] args) {
        new GraphicsDrawStringEx();
    }
}
