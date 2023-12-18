package main.Chapter12;

import javax.swing.*;
import java.awt.*;

public class GraphicsDrawImageEx extends JFrame {
    private MyPanel panel = new MyPanel();

    public GraphicsDrawImageEx(){
        setTitle("이미지 그리기");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(panel);
        setSize(300,420);
        setVisible(true);
    }

    class MyPanel extends JPanel{
        private ImageIcon icon = new ImageIcon("C:\\Study\\Swing\\src\\images/image0.jpg");
        private Image img = icon.getImage();
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(img,20,20,this);
        }
    }

    public static void main(String[] args) {
        new GraphicsDrawImageEx();
    }
}
