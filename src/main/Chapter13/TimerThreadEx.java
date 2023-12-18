package main.Chapter13;

import javax.swing.*;
import java.awt.*;

public class TimerThreadEx extends JFrame {
    public TimerThreadEx(){
        setTitle("쓰레드 연습");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel timerThread = new JLabel();
        timerThread.setFont(new Font("Gothic",Font.ITALIC,80));
        c.add(timerThread);
        TimerThread th = new TimerThread(timerThread);

        setSize(200,200);
        setVisible(true);

        th.start();
    }


    public static void main(String[] args) {
        new TimerThreadEx();
    }
}

class TimerThread extends Thread{
    private JLabel timerThread;

    public TimerThread(JLabel timerThread){
        this.timerThread=timerThread;
    }

    @Override
    public void run(){
        int n=0;

        while(true){
            timerThread.setText(Integer.toString(n));
            n++;
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){return;}
        }
    }
}
