package main.Chapter11;

import javax.swing.*;
import java.awt.*;

public class JTextFieldEx extends JFrame {
    public JTextFieldEx(){
        setTitle("텍스트필드 연습");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(new JLabel("학생"));
        c.add(new JTextField(20));
        c.add(new JLabel("학과"));
        c.add(new JTextField("컴퓨터공학과",20));
        c.add(new JLabel("주소"));
        c.add(new JTextField(20));
        c.add(new JLabel("성별"));

        JTextField j1 = new JTextField(20);
        j1.setEditable(false);
        j1.setText("입력불가");

        c.add(j1);

        setSize(280,150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JTextFieldEx();
    }
}
