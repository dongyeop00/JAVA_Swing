package main.Chapter11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class RadioButtonItemEventEx extends JFrame {
    private JRadioButton[] radio = new JRadioButton[3];
    private String[] text = {"사자","고양이","돌고래"};
    private ImageIcon[] imageIcons ={
            new ImageIcon("C:\\Study\\Swing\\src\\images/image0.jpg"),
            new ImageIcon("C:\\Study\\Swing\\src\\images/image1.jpg"),
            new ImageIcon("C:\\Study\\Swing\\src\\images/image2.jpg")
    };
    private JLabel imageLabel = new JLabel();
    public RadioButtonItemEventEx(){
        setTitle("라디오 버튼 아이템 이벤트 연습");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        JPanel radioPanel = new JPanel();
        radioPanel.setBackground(Color.DARK_GRAY);
        ButtonGroup g = new ButtonGroup();

        for(int i=0; i<radio.length; i++){
            radio[i] = new JRadioButton(text[i]);
            g.add(radio[i]);
            radioPanel.add(radio[i]);
            radio[i].addItemListener(new MyItemListener());
        }

        radio[2].setSelected(true);
        c.add(radioPanel,BorderLayout.NORTH);
        c.add(imageLabel,BorderLayout.CENTER);
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        setSize(250,200);
        setVisible(true);

    }

    class MyItemListener implements ItemListener {
        public void itemStateChanged(ItemEvent e){
            if(e.getStateChange() == ItemEvent.DESELECTED){
                return;
            }
            if(radio[0].isSelected())
                imageLabel.setIcon(imageIcons[0]);
            else if(radio[1].isSelected())
                imageLabel.setIcon(imageIcons[1]);
            else
                imageLabel.setIcon(imageIcons[2]);
        }
    }

    public static void main(String[] args) {
        new RadioButtonItemEventEx();
    }
}
