package main.Chapter07.Iterator;

import java.util.Iterator;
import java.util.Vector;

public class IteratorEx {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        v.add(5);
        v.add(4);
        v.add(100);
        v.add(-4);

        Iterator<Integer> it = v.iterator();
        int sum=0;
        while(it.hasNext()){
            int n = it.next();
            sum+=n;
            System.out.println(n);
        }

        System.out.println(sum);
    }
}
