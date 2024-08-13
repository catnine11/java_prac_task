package com.edu.chap13.level01.basic;

import java.util.HashSet;
import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {

        HashSet<String> id = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("학생 ID 입력('exit' 입력 시 종료): ");
            String input = sc.nextLine();

            if (input.equals("exit")){
                break;
            }

            if(id.contains(input)){
                System.out.println("이미 등록 된 ID입니다.");
            }else{
                id.add(input);
                System.out.println("ID가 추가 되었습니다.");
            }

        }
        System.out.print("모든 학생의 ID : ");
        System.out.println(id);

        sc.close();


    }
}
