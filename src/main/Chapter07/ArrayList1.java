package main.Chapter07;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<String>();
        int longest=0;

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<5; i++){
            System.out.print("이름을 입력하세요 : ");
            String name = sc.next();
            s.add(name);
        }

        for(int i=0; i<s.size(); i++){
            String prt = s.get(i);
            System.out.print(prt + " ");
        }

        for(int i=0; i<s.size(); i++){
            if(s.get(longest).length() < s.get(i).length()){
                longest = i;
            }
        }
        System.out.println();
        System.out.println("가장 긴 이름 : " + s.get(longest));

    }
}
