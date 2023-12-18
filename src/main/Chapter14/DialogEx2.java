package main.Chapter14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogEx2 extends JFrame {
    private MyModalDialog dialog;

    public DialogEx2(){
        super("모달 다이아로그 예제");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JButton bt1 = new JButton("show modal Dialog");

        dialog = new MyModalDialog(this, "Test Modal Dialog");

        bt1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dialog.setVisible(true);

                String str = dialog.getInput();

                if(str==null)
                    return;

                JButton btn = (JButton)e.getSource();
                btn.setText(str);
            }
        });

        getContentPane().add(bt1);
        setSize(250,200);
        setVisible(true);

    }

    public static void main(String[] args) {
        new DialogEx2();
    }
}

class MyModalDialog extends JDialog{
    private JTextField tf = new JTextField(10);
    private JButton bt = new JButton("okay");

    public MyModalDialog(JFrame frame, String title){
        super(frame,title,true);
        setLayout(new FlowLayout());
        add(tf);
        add(bt);
        setSize(250,200);

        bt.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               setVisible(false);
           }
        });
    }

    public String getInput(){
        if(tf.getText().length() ==0)
            return null;
        else
            return tf.getText();
    }
}
