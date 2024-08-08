package com.edu.chap09.level01.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
         /* 사용자로부터 입력받은 텍스트에서 단어의 빈도를 계산하고, 가장 자주 등장하는
    단어를 출력하는 프로그램을 String과 StringBuilder를 활용하여 구현한다.
     단, 영문자만 대소문자 구분 없이 취급한다.
      ----- 입력 예시 -----
     *
     * 문자열 입력 : hello world Hello everyone! 안녕하세요 반갑습니다
     *
     * ----- 출력
      예시 -----
     *
     * ===== 단어 빈도 =====
     * hello: 2
     * world: 1
     * everyone: 1
     * 가장 빈도 높은 단어 : hello (2 번)
     */

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String input = sc.nextLine();

        String[] words = input.toLowerCase().split(" ");

        String mostFrequentWord = "";
        int highFrequency = 0;
        int[] cnts = new int[words.length];

        System.out.println("===== 단어 빈도 =====");
        for(int i = 0; i < words.length; i++){
//            System.out.println(words[i]);
            if(words[i].isEmpty()){
                continue;
            }
            int cnt = 0;
            boolean isPrinted = false;

            for(int j = 0; j < words.length; j++){
                // 이미 있는 단어면 카운트
                if(words[i].equals(words[j])){
                    cnt++;
                }
                // 이미 출력된 단어인지 확인
                if(j < i && words[i].equals(words[j])){
                    isPrinted = true;
                    break;
                }
            }
            cnts[i] = cnt;
            if(cnt > highFrequency){
                highFrequency = cnt;
                mostFrequentWord = words[i];
            }
            if(!isPrinted){
                System.out.println(words[i] + ": " + cnts[i]);
            }

        }
        System.out.printf("가장 빈도 높은 단어 : %s (%d 번) ", mostFrequentWord, highFrequency);

    }

}
