package Chapter09;

import javax.swing.*;
import java.awt.*;

public class GridLayout02 extends JFrame {
    public GridLayout02(){
        setTitle("GridLayout TextField");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(4,2);
        grid.setVgap(5);

        Container c = getContentPane();
        c.setLayout(grid);

        c.add(new JLabel( " 이름"));
        c.add(new TextField(""));

        c.add(new JLabel( " 학번"));
        c.add(new TextField(""));

        c.add(new JLabel( " 학과"));
        c.add(new TextField(""));

        c.add(new JLabel( " 과목"));
        c.add(new TextField(""));

        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayout02();
    }
}
