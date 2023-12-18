package main.Chapter12;

import javax.swing.*;
import java.awt.*;

public class GraphicsDrawImageEx2 extends JFrame {
    private MyPanel panel = new MyPanel();
    public GraphicsDrawImageEx2(){
        setTitle("판넬에 꽉차게 이미지 그리기");
        setContentPane(panel);
        setSize(600,300);
        setVisible(true);
    }

    class MyPanel extends JPanel{
        private ImageIcon icon = new ImageIcon("C:\\Study\\Swing\\src\\images/image0.jpg");
        private Image img = icon.getImage();
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(img,0,0,getWidth(),getHeight(),this);
        }
    }

    public static void main(String[] args) {
        new GraphicsDrawImageEx2();
    }
}
