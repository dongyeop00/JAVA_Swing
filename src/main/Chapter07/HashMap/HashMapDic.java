package main.Chapter07.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDic {
    public static void main(String[] args) {
        //영어 단어와 한글 단어의 쌍을 저장하는 HashMap 컬렉션 생성
        HashMap<String, String> dic = new HashMap<String, String>();

        dic.put("baby", "아기");
        dic.put("apple","사과");
        dic.put("banana","바나나");

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("찾고 싶은 단어 : ");
            String eng = sc.next();
            if(eng.equals("exit")){
                System.out.println("프로그램을 종료합니다");
                break;
            }
            String kor = dic.get(eng);
            if(kor == null){
                System.out.println(eng + "는 없는 단어입니다.");
            }
            else{
                System.out.println(kor);
            }
        }
        sc.close();
    }
}
