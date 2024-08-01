package com.edu.chap03.level01.basic;

public class Calculator {

    public void checkMethod(){
        /*함수 호출 확인용 메소드*/
        System.out.println("메소드 호출 확인");
    }

    public int sum1to10(){
        /*1부터 10까지 수를 더하여 값을 리턴함*/
        int sum = 1+2+3+4+5+6+7+8+9+10;
        return sum;
    }

    public void checkMaxNumber(int a, int b){
        /*두 수를 입력받아 큰 수를 출력함*/

        System.out.println("두 수 중 큰 수는 " + Math.max(a, b) + "이다.");
    }

    public int sumTwoNumber(int a, int b){
        /*두 수를 입력받아 합을 리턴함*/
//        int result = a + b;
//        System.out.println(a + "과 " + b + "의 합은 : " + result);
        return a + b;
    }

    public int minusTwoNumber(int a, int b){
        /*두 수를 입력받아 차를 리턴함*/

        return a - b;
    }


}
