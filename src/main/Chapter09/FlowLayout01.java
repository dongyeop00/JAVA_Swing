package main.Chapter09;

import javax.swing.*;
import java.awt.*;

public class FlowLayout01 extends JFrame {
    public FlowLayout01(){
        setTitle("FlowLayout Test");

        Container c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
        c.add(new JButton("add"));
        c.add(new JButton("sub"));
        c.add(new JButton("mul"));
        c.add(new JButton("div"));
        c.add(new JButton("cal"));

        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayout01();
    }
}
