package Chapter09;

import javax.swing.*;
import java.awt.*;

public class GridLayout01 extends JFrame {
    public GridLayout01(){
        setTitle("GridLayout Test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new GridLayout(4,3,5,5)); //4x3 5간격씩

        for(int i=0; i<11; i++){
            c.add(new JButton(i + ""));
        }

        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayout01();
    }
}
