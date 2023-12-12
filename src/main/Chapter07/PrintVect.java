package main.Chapter07;

import java.util.Vector;

public class PrintVect {

    public static void printVector(Vector<Integer> v){
        for(int i=0; i<v.size(); i++){
            int n = v.get(i);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();

        v.add(5);
        v.add(7);
        v.add(90);

        printVector(v);
    }

}
