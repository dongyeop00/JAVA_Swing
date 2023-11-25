package main.Chapter11;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

class MyFrame extends JFrame{
    JRadioButton jb[]=new JRadioButton[2];
    //이미지 파일의 위치와 이름에 따라 달라짐
    ImageIcon image[]= {new ImageIcon("images/red.png")
            ,new ImageIcon("images/blue.png")
            ,new ImageIcon("images/green.png")};
    int index=0;
    JLabel jl=new JLabel(image[0]);
    public MyFrame() {
        setTitle("Image Gallery Practice Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=getContentPane();
        c.setLayout(new BorderLayout());

        JPanel north=new JPanel();
        north.setLayout(new FlowLayout());
        jb[0]=new JRadioButton("left");
        jb[0].setSelected(true);
        jb[1]=new JRadioButton("right");
        north.add(jb[0]);
        north.add(jb[1]);

        ButtonGroup g=new ButtonGroup();
        g.add(jb[0]);
        g.add(jb[1]);

        c.add(north,BorderLayout.NORTH);


        c.add(jl,BorderLayout.CENTER);
        jl.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if(jb[0].isSelected()) {
                    index=(index+1)%image.length;
                }
                else {
                    index--;
                    if(index<0) {
                        index=image.length-1;
                    }
                }
                jl.setIcon(image[index]);
            }
        });

        setSize(300,300);
        setVisible(true);
    }
}

public class Assignment11 {
    public static void main(String[] args) {
        new MyFrame();
    }
}
