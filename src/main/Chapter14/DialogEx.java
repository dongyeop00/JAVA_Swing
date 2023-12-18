package main.Chapter14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogEx extends JFrame {
    private MyDialog dialog;

    public DialogEx(){
        setTitle("다이아로그 연습");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton btn = new JButton("Show Dialog");

        dialog = new MyDialog(this, "dialog");
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dialog.setVisible(true);

                String str = dialog.getInput();

                JButton btn = (JButton)e.getSource();
                btn.setText(str);
            }
        });

        getContentPane().add(btn);
        setSize(250,200);
        setVisible(true);

    }

    public static void main(String[] args) {
        new DialogEx();
    }
}

class MyDialog extends JDialog{
    private JTextField tf = new JTextField(10);
    private JButton bt = new JButton("okay");

    public MyDialog(JFrame frame, String title){
        super(frame, title,true);
        setLayout(new FlowLayout());
        add(tf);
        add(bt);
        setSize(150,200);

        bt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                setVisible(false);
            }
        });
    }

    public String getInput(){
        if(tf.getText().length() == 0){
            return null;
        }
        else
            return tf.getText();
    }
}
