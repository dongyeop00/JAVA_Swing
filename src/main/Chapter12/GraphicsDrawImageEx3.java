package main.Chapter12;

import javax.swing.*;
import java.awt.*;

public class GraphicsDrawImageEx3 extends JFrame {
    private MyPanel panel = new MyPanel();

    public GraphicsDrawImageEx3(){
        setTitle("이미지 일부분 크기조절해 그리기");
        setContentPane(panel);
        setSize(300,300);
        setVisible(true);
    }

    class MyPanel extends JPanel{
        private ImageIcon icon = new ImageIcon("C:\\Study\\Swing\\src\\images/image0.jpg");
        private Image img = icon.getImage();
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(img,20,20,150,150,100,100,200,200,this);
        }
    }

    public static void main(String[] args) {
        new GraphicsDrawImageEx3();
    }
}
