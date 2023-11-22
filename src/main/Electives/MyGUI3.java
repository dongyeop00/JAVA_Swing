package main.Electives;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGUI3 {
    public MyGUI3(){
        JFrame dongyeop = new JFrame();
        dongyeop.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dongyeop.setLocationRelativeTo(null);

        dongyeop.setSize(600,300);
        dongyeop.setTitle("구동엽의 세번째 GUI");
        dongyeop.setLayout(null);


        JLabel label1 = new JLabel("나는 Label1 입니다.");
        label1.setFont(new Font("고딕",Font.BOLD,20));
        label1.setLocation(10,10);
        label1.setSize(200,20);
        dongyeop.add(label1);

        JButton button1 = new JButton("나는 button1");
        button1.setFont(new Font("고딕",Font.BOLD,20));
        button1.setLocation(10,50);
        button1.setSize(200,30);
        dongyeop.add(button1);

        String header[] = { "학번", "이름", "전공", "교양", "합계", "평가" };
        DefaultTableModel model = new DefaultTableModel();

        JTable table1 = new JTable(model);
        for (int C = 0; C < header.length; C++) {
            model.addColumn(header[C]);
        }
        model.addRow(new Object[] { "1" });

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int C = 0; C < table1.getColumnCount(); C++) {
            table1.getColumnModel().getColumn(C).setCellRenderer(rightRenderer);
        }
        table1.setRowHeight(25);

        JScrollPane scrollPane = new JScrollPane(table1);
        scrollPane.setLocation(250, 10);
        scrollPane.setSize(300, 200);

        dongyeop.add(scrollPane);

        JOptionPane.showMessageDialog(null, "줄 추가", "addRow()", JOptionPane.INFORMATION_MESSAGE);
        model.addRow(new Object[] { "2", "유수봉", 77, 88 });

        JOptionPane.showMessageDialog(null, "줄 삭제", "removeRow()", JOptionPane.INFORMATION_MESSAGE);
        model.removeRow(0);

        button1.setText("합계 & 평균");
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int total;
                total = (Integer) (table1.getValueAt(0, 2)) + (Integer) (table1.getValueAt(0, 3));
                table1.setValueAt((Object) total, 0, 4);
                table1.setValueAt((Object) (total / 2), 0, 5);
            }
        });

        JPanel panel1 = new JPanel();
        panel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Top Field"));
        panel1.setLocation(10, 150);
        panel1.setSize(200, 70);

        dongyeop.add(panel1);

        JButton btnINSERT = new JButton("INSERT");
        btnINSERT.setFont(new Font("고딕", Font.BOLD, 13));
        btnINSERT.setBackground(Color.green);
        panel1.add(btnINSERT);

        JButton btnDELETE = new JButton("DELETE");
        btnDELETE.setFont(new Font("고딕", Font.BOLD, 13));
        btnDELETE.setBackground(Color.red);
        panel1.add(btnDELETE);

        btnINSERT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                model.addRow(new Object[] { "2", "유수봉", 77, 88 });
            }
        });



        dongyeop.setVisible(true);
        dongyeop.setSize(600,300);
    }

    public static void main(String[] args) {
        new MyGUI3();
    }
}
