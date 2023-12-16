package main.Chapter07.HashMap;

import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("baby","아기");
        map.put("love","사랑");
        map.put("apple","사과");

        String kor = map.get("love");

        System.out.println(kor);
        System.out.println("size : " + map.size());

        map.remove("apple");
        System.out.println("apple 제거 완료");
        System.out.println("size : " + map.size());
    }
}
