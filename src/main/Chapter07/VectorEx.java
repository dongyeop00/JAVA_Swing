package main.Chapter07;

import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        //int형 Vector 선언
        Vector<Integer> v = new Vector<>();

        //요소 삽입
        v.add(5);
        v.add(7);
        v.add(-1);

        //7과 -1 사이에 요소 삽입
        v.add(2,100);

        System.out.println("Vector v size : " + v.size());
        System.out.println("Vector v capacity : " + v.capacity()); //벡터 현재 용량

        //Vector 요소 출력
        for(int i = 0; i<v.size(); i++){
            int n = v.get(i); //Vector 값 얻기
            System.out.print(n + " ");
        }
        System.out.println();

        int sum = 0;
        //Vector 요소 더하기
        for(int i=0; i<v.size(); i++){
            int n = v.elementAt(i);
            sum +=n;
        }

        System.out.println("Vector sum : " + sum);
    }
}
