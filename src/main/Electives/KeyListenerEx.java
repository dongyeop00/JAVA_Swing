package main.Electives;

//생성자=>변수
//GridLayout
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class KeyListenerEx extends JFrame implements ActionListener{
    JButton b1,b2;
    JButton[][] pan=new JButton[5][5];
    int[][] panCount=new int [5][5];
    int brow=0;
    int bcol=0;
    //0~8 난수발생
    public void getRand()
    {
        int[] com=new int[25]; //중복이 없는 난수값을 저장
        int su=0; //난수 발생시 저장한 변수
        boolean bCheck=false; //중복 여부 확인
        for(int i=0;i<25;i++)
        {
            //난수발생
            bCheck=true;
            while(bCheck)
            {
                su=(int)(Math.random()*25);
                bCheck=false;
                //검색 => 저장된 데이터가 중복여부 확인
                for(int j=0;j<i;j++)
                {
                    if(su==com[j]) //같은 수가 저장
                    {
                        //while을 다시 수행
                        bCheck=true;
                        break;
                    }
                }
            }
            com[i]=su;

            panCount[i/5][i%5]=su;

            if(su==24)
            {
                brow=i/5;
                bcol=i%5;
            }
        }
    }
    //배치함수
    public void display()
    {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(i==brow && j==bcol)
                {
                    pan[i][j].setText("");
                    pan[i][j].setEnabled(false);
                }
                else
                {
                    pan[i][j].setText(String.valueOf(panCount[i][j]+1));
                    pan[i][j].setEnabled(true);
                }
            }
        }
    }
    //버튼클릭
    public KeyListenerEx() //생성자 => 클래스를 메모리에 저장할 때 가장 먼저 호출되는 메소드
    {
        //배치
        b1=new JButton("시작");
        b2=new JButton("종료");
        JPanel p=new JPanel();
        setTitle("내가 만든 퍼즐 게임");
        p.add(b1);p.add(b2);
        add("South",p);

        JPanel p2=new JPanel();
        p2.setLayout(new GridLayout(5,5,5,5));
        int k=1;
        for(int i=0; i<5; i++)
        {
            for(int j=0;j<5;j++)
            {
                pan[i][j]=new JButton(String.valueOf(k));
                pan[i][j].setFont(new Font("굴림체",Font.BOLD,50));
                p2.add(pan[i][j]);
                pan[i][j].addActionListener(this);
                k++;
            }
        }
        add("Center", p2);

        getRand();
        display();

        setSize(550,600);
        setVisible(true);

        b1.addActionListener(this);//이벤트등록
        //b2.addActionListener(this);
    }
    public static void main(String[] args)
    {
        new KeyListenerEx();
        //생성자 호출시 반드시 앞에 new 붙여서!
    }

    //종료여부확인
    public boolean isEnd(){
        int k=0;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(panCount[i][j]!=k)
                    return false;
                k++;
            }
        }return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            getRand();
            display();
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(e.getSource()==pan[i][j])
                {
                    panCount[brow][bcol]=panCount[i][j];
                    panCount[i][j]=24;
                    brow=i;
                    bcol=j;
                    display();
                    if(isEnd())
                    {
                        JOptionPane.showMessageDialog(this, "Game Over!!");
                        System.exit(0);
                    }
                }
            }
        }
    }
}