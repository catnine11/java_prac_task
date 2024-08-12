package com.edu.chap13.level01.basic;

import java.util.*;

public class Application2 {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        List<String> urlList = new ArrayList<>();

        while (true){
            System.out.print("방문 URL을 입력하세요 (단, exit를 입력하면 종료) : ");
            String url = sc.nextLine();

            if(url.trim().equals("exit")){
                break;
            }

            urlList.add(0, url);

            if(urlList.size() > 5){
                urlList.remove(urlList.size()-1);
            }

            System.out.print("최근 방문 url : ");
            System.out.println(urlList);
        }
         */

        // Deque
        Scanner sc = new Scanner(System.in);
        Deque<String> recentUrls = new LinkedList<>();

        while(true){
            System.out.print("방문 URL을 입력하세요 (단, exit를 입력하면 종료) : ");
            String url = sc.nextLine();

            if(url.trim().equals("exit")){
                break;
            }

            recentUrls.addFirst(url);

            if(recentUrls.size() > 5){
                recentUrls.removeLast();
            }

            System.out.print("최근 방문 url : ");
            System.out.println(recentUrls);
        }


    }
}
