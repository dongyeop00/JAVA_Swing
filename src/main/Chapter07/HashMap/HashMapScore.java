package main.Chapter07.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScore {
    public static void main(String[] args) {
        //사용자 이름과 점수를 기록하는 HashMap 컬렉션 생성
        HashMap<String, Integer> score = new HashMap<String, Integer>();

        score.put("구동엽",80);
        score.put("김다은",90);
        score.put("문준웅",84);
        score.put("이준재",86);
        score.put("김동현",74);

        //key 문자열을 가진 집합 Set 컬렉션 리턴
        //score에 있는 String만 저장
        Set<String> keys = score.keySet();

        //key 문자열을 순서대로 접근할 수 있는 iterator 리턴
        Iterator<String> it = keys.iterator();

        while(it.hasNext()){
            String name = it.next();
            int n = score.get(name);
            System.out.println(name + " : " + n);
        }
    }
}
