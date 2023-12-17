package main.Chapter11;

import javax.swing.*;
import java.awt.*;

public class RadioButtonEx extends JFrame {
    public RadioButtonEx(){
        setTitle("라디오 버튼 연습");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        ImageIcon selectcon = new ImageIcon("C:\\Study\\Swing\\src\\images/image0.jpg");

        ButtonGroup g = new ButtonGroup();
        JRadioButton apple = new JRadioButton("사과");
        JRadioButton pear = new JRadioButton("배");
        JRadioButton lion = new JRadioButton("사자",selectcon);
        lion.setBorderPainted(true);

        g.add(apple);
        g.add(pear);
        g.add(lion);

        c.add(apple);
        c.add(pear);
        c.add(lion);

        setSize(250,150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RadioButtonEx();
    }
}
