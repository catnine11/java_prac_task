package com.edu.chap13.level01.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> phoneBook = new HashMap<>();
        while(true) {
            System.out.print("이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): ");
            String input = sc.nextLine();

            if (input.equals("exit")) {
                break;
            } else if (input.equals("search")) {
                System.out.print("검색 할 이름 : ");
                String name = sc.nextLine();
                if (phoneBook.containsKey(name)) {
                    System.out.printf("%s씨의 전화번호 : %s\n", name, phoneBook.get(name));
                } else{
                    System.out.println(name + "씨의 번호는 등록 되어 있지 않습니다.");
                }
            } else{
                String[] words = input.split(" ");
                if (words.length == 2) {
                    phoneBook.put(words[0], words[1]);
                    System.out.print("추가 완료 : ");
                    System.out.printf("%s %s\n", words[0], words[1]);
                } else{
                    System.out.println("입력이 잘못 되었습니다. 다음 양식으로 입력해주세요 : <이름> <전화번호>");
                }
            }
        }
        sc.close();
    }
}
