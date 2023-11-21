package main.Chapter10;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Assignment10 extends JFrame{
    JLabel label;
    Assignment10(){
        setTitle("클릭 연습용 응용프로그램"); // 제목 지정
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label= new JLabel("Love Java");
        label.setSize(100,50);
        label.setLocation(100,100);
        label.addMouseListener(new MyMouseAdapter());

        add(label);
        setSize(500,500);
        setVisible(true);
        label.requestFocus();

    }
    public static void main(String[] args) {
        new Assignment10();
    }

    class MyMouseAdapter extends MouseAdapter{
        int x,y;
        public void mousePressed(MouseEvent e) {
            x = (int)(Math.random()*400); // 여백을 조금 남기기 위해 400으로 지정
            y = (int)(Math.random()*400); // 여백을 조금 남기기 위해 400으로 지정
            label.setLocation(x,y);
        }
    }
}
