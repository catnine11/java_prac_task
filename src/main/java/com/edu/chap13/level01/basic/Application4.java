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

            id.add(input);
            System.out.println("ID가 추가 되었습니다.");

        }
        System.out.print("모든 학생의 ID : [");
        System.out.println(id);
        System.out.println("]");

        sc.close();


    }
}
