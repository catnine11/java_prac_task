package com.edu.chap12.level01.basic;

public class Application2 {
    // 나중에 다시 봐야함(이해 완벽히 x)
    public static <T extends Number> double sum(T[] arr){
        double sum = 0.0;
        for(T num : arr){
            sum += num.doubleValue();
        }

        return sum;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Integer 합계 : " + sum(intArray));    //15.0

        Double[] doubleArray = {1.1, 2.2, 3.3}; //6.6
        System.out.println("Double 합계 : " + sum(doubleArray));

        String[] strArray = {"A", "B", "C"};
//        System.out.println("String 합계 : " + sum(strArray));  // 컴파일 에러 발생
    }

}
