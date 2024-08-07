package com.edu.chap09.level01.basic;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /*사용자로부터 입력받은 텍스트에서 공백 문자를 기준으로 앞 글자를 대문자로 만들어서
        변환해서 출력하는 프로그램을 String과 StringBuilder를 활용하여 구현한다.
        전체 단어의 개수도 함께 출력한다. */
        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : I will be a good developer.
         *
         * ----- 출력 예시 -----
         *
         * 변환된 문자열: I Will Be A Good Developer.
         * 총 단어 개수: 6
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String input = sc.nextLine();

        String[] str = input.split(" ");
//        for (int i = 0; i < str.length; i++) {
//            System.out.println("str[" + i + "] = " + str[i]);
//        }

        StringBuilder result = new StringBuilder();

        for(String s:str){
            String first = s.substring(0,1).toUpperCase();
            result
                    .append(first)
                    .append(s.substring(1))
                    .append(" ");
        }

        int count = str.length;

        System.out.println("변환된 문자열: " + result);
        System.out.println("총 단어 개수: " + count);



    }
}
