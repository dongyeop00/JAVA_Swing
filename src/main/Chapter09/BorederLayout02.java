package main.Chapter09;

import javax.swing.*;
import java.awt.*;

public class BorederLayout02 extends JFrame {
    public BorederLayout02(){
        setTitle("BorderLayout02");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        BorderLayout n = new BorderLayout();
        Container c = getContentPane();
        c.setLayout(n);

        c.add(new JButton("hello"),n.EAST);
        c.add(new JButton("dong"),n.SOUTH);
        c.add(new JButton("yeop"),n.WEST);
        c.add(new JButton("jun"),n.NORTH);
        c.add(new JButton("jae"),n.CENTER);

        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorederLayout02();
    }
}
