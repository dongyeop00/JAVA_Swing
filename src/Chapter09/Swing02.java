package Chapter09;

import javax.swing.*;
import java.awt.*;

public class Swing02 extends JFrame {
    public Swing02(){
        setTitle("Button");

        //1. 컨텐트팬 알아내기
        Container contentPane = getContentPane();
        contentPane.setBackground(Color.ORANGE); //배경색 바꾸기
        contentPane.setLayout(new FlowLayout()); //배치 설정

        //2. 버튼 추가
        contentPane.add(new JButton("OK"));
        contentPane.add(new JButton("Cancle"));
        contentPane.add(new JButton("Ignore"));

        setSize(300,150); //300x300
        setVisible(true); //프레임 출력
    }

    public static void main(String[] args) {
        new Swing02();
    }
}