package main.Chapter07.HashMap;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapStudentEx {
    public static void main(String[] args) {
        //id와 전화번호로 구성되는 Student 클래스를 만들고
        //이름을 '키'로 하고 Student 객체를 값으로 하는 해시맵 작성
        HashMap<String, Student> map = new HashMap<String, Student>();
        Scanner sc = new Scanner(System.in);

        map.put("구동엽",new Student(1,"010-2541-9466"));
        map.put("김다은",new Student(2,"010-2555-6483"));
        map.put("문준웅",new Student(3,"010-7221-6383"));

        while(true){
            System.out.print("검색할 이름 : ");
            String name = sc.next();

            if(name.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            Student student = map.get(name);
            if(student == null){
                System.out.println(name + "은 없는 사람입니다.");
            }
            else{
                System.out.println("id: " + student.id + ", tel: " + student.tel);
            }
        }
        sc.close();
    }
}

class Student{
    int id;
    String tel;

    public Student(int id, String tel){
        this.id = id;
        this.tel = tel;
    }
}
