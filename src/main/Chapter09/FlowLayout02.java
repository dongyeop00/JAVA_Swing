package main.Chapter09;

import javax.swing.*;
import java.awt.*;

public class FlowLayout02 extends JFrame {
    public FlowLayout02(){
        setTitle("FlowLayout02");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT,30,40);

        Container container = getContentPane();
        container.setLayout(flowLayout);
        container.add(new JButton("1"));
        container.add(new JButton("2"));

        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayout02();
    }
}
