package main.Test;


import java.io.Console;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        String inputString = "동엽,다은,철수";
        List<String> stringList = Arrays.asList(inputString.split(","));

        // 결과 확인
        for (String name : stringList) {
            System.out.println(name);
        }
    }
}
