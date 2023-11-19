package main.Chapter09;

import javax.swing.*;
import java.awt.*;

public class Swing02 extends JFrame {
    public Swing02(){
        setTitle("Button");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //1. 컨텐트팬 알아내기
        Container contentPane = getContentPane();
        contentPane.setBackground(Color.ORANGE);
        contentPane.setLayout(new FlowLayout());

        //2. 버튼 추가
        contentPane.add(new JButton("OK"));
        contentPane.add(new JButton("Cancle"));
        contentPane.add(new JButton("Ignore"));

        setSize(300,150);
        setVisible(true); //프레임 출력
    }

    public static void main(String[] args) {
        new Swing02();
    }
}

