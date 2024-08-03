package com.edu.chap04.looping_and_branching.level04.advanced;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        /* 받은 금액을 입력 받고, 상품 가격을 입력 받아 거스름돈을 계산하는 프로그램을 작성하세요
         *
         * 단, 거스름돈은 대한민국 화폐 단위 별 필요 수량이 출력되도록 작성하고,
         * 지폐외 동전을 구분하여 단위를 표기하세요
         *
         * -- 입력 예시 --
         * 받으신 금액을 입력하세요 : 100000
         * 상품 가격을 입력하세요 : 22340
         *
         * -- 출력 예시 --
         * ============================
         * 50000원권 지폐 1장
         * 10000원권 지폐 2장
         * 5000원권 지폐 1장
         * 1000원권 지폐 2장
         * 500원권 동전 1개
         * 100원권 동전 1개
         * 50원권 동전 1개
         * 10원권 동전 1개
         * ============================
         * 거스름돈 : 77660원
         * */
        Scanner sc = new Scanner(System.in);
        System.out.print("받으신 금액을 입력하세요 : ");
        int amount = sc.nextInt();
        System.out.print("상품 가격을 입력하세요 : ");
        int price = sc.nextInt();
        int change = amount - price;
        int bill50000, bill10000, bill5000, bill1000 = 0;
        int coin500, coin100, coin50, coin10 = 0;

        System.out.println("============================");
        while (change >= 1000) {
            if (change >= 50000) {
                bill50000 = change / 50000;
                change = change % 50000;
                System.out.printf("%d원권 지폐 %d장\n", 50000, bill50000);
            } else if (change >= 10000) {
                bill10000 = change / 10000;
                change = change % 10000;
                System.out.printf("%d원권 지폐 %d장\n", 10000, bill10000);
            } else if (change >= 5000) {
                bill5000 = change / 5000;
                change = change % 5000;
                System.out.printf("%d원권 지폐 %d장\n", 5000, bill5000);
            } else if (change >= 1000) {
                bill1000 = change / 1000;
                change = change % 1000;
                System.out.printf("%d원권 지폐 %d장\n", 1000, bill1000);
            }
        }

        while (change > 0) {
            if (change >= 500) {
                coin500 = change / 500;
                change = change % 500;
                System.out.printf("%d원권 동전 %d개\n", 500, coin500);
            } else if (change >= 100) {
                coin100 = change / 100;
                change = change % 100;
                System.out.printf("%d원권 동전 %d개\n", 100, coin100);
            } else if (change >= 50) {
                coin50 = change / 50;
                change = change % 50;
                System.out.printf("%d원권 동전 %d개\n", 50, coin50);
            } else if (change >= 10) {
                coin10 = change / 10;
                change = change % 10;
                System.out.printf("%d원권 동전 %d개\n", 10, coin10);
            }
        }
        System.out.println("============================");
        System.out.printf("거스름돈 : %d원\n", amount - price);

    }
}
