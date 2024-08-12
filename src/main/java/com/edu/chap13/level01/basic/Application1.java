package com.edu.chap13.level01.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> sclist = new ArrayList<Integer>();

        while (true) {
            System.out.print("학생 성적 : ");
            int score = sc.nextInt();
            sc.nextLine();
            sclist.add(score);
//            System.out.println(sclist);

            System.out.println("추가 입력하려면 y : ");
            char answer = sc.nextLine().charAt(0);
            if (answer == 'y' || answer == 'Y') {
                continue;
            } else if (answer == 'n' || answer == 'N') {
                break;
            }
        }

            double sum = 0;
            for(double num : sclist){
                sum += num;
            }
            double avg = sum/sclist.size();

        System.out.println("학생 인원 : " + sclist.size());
        System.out.println("평균 점수 : " + avg);

        sc.close();
    }
}
