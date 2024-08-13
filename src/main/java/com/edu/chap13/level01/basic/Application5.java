package com.edu.chap13.level01.basic;

import java.util.*;

public class Application5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        while(true){
            System.out.print("단어 입력 ('exit' 입력 시 종료): ");
            String word = sc.nextLine().trim();

            if(word.equals("exit")){
                break;
            }

            list.add(word);
        }

        Collections.sort(list);
        System.out.print("정렬 된 단어 : ");
        System.out.println(list);

        sc.close();
    }
}
