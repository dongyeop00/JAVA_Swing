package main.Chapter11;

import javax.swing.*;
import java.awt.*;

public class ButtonEx extends JFrame {
    public ButtonEx(){
        setTitle("버튼 이미지 연습");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        ImageIcon normalIcon = new ImageIcon("C:\\Study\\Swing\\src\\images/image0.jpg");
        ImageIcon pressedIcon = new ImageIcon("C:\\Study\\Swing\\src\\images/image1.jpg");
        ImageIcon rolloverIcon = new ImageIcon("C:\\Study\\Swing\\src\\images/image2.jpg");

        JButton btn = new JButton("call~~", normalIcon);
        btn.setPressedIcon(pressedIcon);
        btn.setRolloverIcon(rolloverIcon);

        c.add(btn);

        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ButtonEx();
    }
}
