package com.edu.chap03.level01.basic;

import java.util.Scanner;

public class Application_Result {
    public static void main(String[] args) {
        /*모든 메소드는 main 함수에서 호출하여 출력시킨다.*/
        Calculator cal = new Calculator();

        /*메소드 호출 확인
        1부터 10까지의 합 : 55
        두 수 중 큰 수는 20이다.
        10과 20의 합은 : 30
        10과 5의 차는 : */
        cal.checkMethod();
        cal.sum1to10();

        System.out.println("비교할 수 두 개를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        cal.checkMaxNumber(a, b);

        System.out.println("합 구하기");
        int c = sc.nextInt();
        System.out.print("과 ");
        int d = sc.nextInt();
        System.out.print("의 합은 : ");
        System.out.println(cal.sumTwoNumber(c, d));

        System.out.println("차 구하기");
        int e = sc.nextInt();
        System.out.println("과 ");
        int f = sc.nextInt();
        System.out.print("의 차는 : ");
        System.out.println(cal.minusTwoNumber(e,f));

        sc.close();


    }
}
