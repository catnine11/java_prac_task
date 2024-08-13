package com.edu.chap13.level01.basic;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {

        // 큐
        Scanner sc = new Scanner(System.in);
        Queue<String> wait = new LinkedList<>();

        while(true){
            System.out.print("대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): ");
            String input = sc.nextLine().trim();

            if(input.equals("exit")){
                break;
            } else if(input.equals("next")){
                if(wait.isEmpty()){
                    System.out.println("대기 고객이 없습니다.");
                } else {
                    String next = wait.poll();
                    System.out.println(next + " 고객님 차례입니다.");
                }

            } else {
                wait.offer(input);
                System.out.println(input + " 고객님 대기 등록 되었습니다.");
            }
        }
        sc.close();

    }
}
