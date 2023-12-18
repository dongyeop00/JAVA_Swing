package main.Chapter14;

import javax.swing.*;

public class MenuEx extends JFrame {
    public MenuEx(){
        setTitle("메뉴 만들기!");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createMenu();
        setSize(250,200);
        setVisible(true);
    }

    private void createMenu(){
        JMenuBar mb = new JMenuBar();
        JMenu mn = new JMenu("screen");
        JMenu mn2 = new JMenu("Run");
        mn2.setToolTipText("실행의 명령어들");

        mn.add(new JMenuItem("Load"));
        mn.add(new JMenuItem("Hide"));
        mn.add(new JMenuItem("ReShow"));
        mn.addSeparator();
        mn.add(new JMenuItem("Exit"));

        mn2.add(new JMenuItem("exit"));

        mb.add(mn);
        mb.add(new JMenu("Edit"));
        mb.add(new JMenu("Source"));
        mb.add(new JMenu("Project"));
        mb.add(mn2);

        ToolTipManager m = ToolTipManager.sharedInstance();
        m.setInitialDelay(1000);
        m.setDismissDelay(10000);



        setJMenuBar(mb);
    }

    public static void main(String[] args) {
        new MenuEx();
    }
}
