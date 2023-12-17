package main.Chapter11;

import javax.swing.*;
import java.awt.*;

public class CheckBoxEx extends JFrame {
    public CheckBoxEx(){
        setTitle("체크박스 이미지 연습~");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        ImageIcon lionIcon = new ImageIcon("C:\\Study\\Swing\\src\\images/image0.jpg");
        ImageIcon catIcon = new ImageIcon("C:\\Study\\Swing\\src\\images/image1.jpg");

        JCheckBox lion = new JCheckBox("사자");
        JCheckBox cat = new JCheckBox("고양이");
        cat.setBorderPainted(true);
        JCheckBox all = new JCheckBox("true",lionIcon);
        all.setBorderPainted(true);
        all.setSelectedIcon(catIcon);

        c.add(lion);
        c.add(cat);
        c.add(all);

        setSize(500,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBoxEx();
    }
}
