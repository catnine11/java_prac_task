package com.edu.chap11.level01.basic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Application_read {
    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * (존재하는 파일명을 입력한 경우)
         * 파일 이름을 입력하세요 : hello.txt
         *
         * ----- 출력 예시 -----
         *
         * ===== 파일 내용 출력 =====
         * 안녕하세요. 반갑습니다. 제 이름은 홍길동입니다.
         *
         * ----- 입력 예시 -----
         *
         * (존재하지 않는 파일명을 입력한 경우)
         * 파일 이름을 입력하세요 : unknown.txt
         *
         * ----- 출력 예시 -----
         *
         * 오류 : 해당 이름을 가진 파일이 없습니다.
         *
         */
        Scanner sc = new Scanner(System.in);
        FileReader fr = null;
        System.out.print("파일 이름을 입력하세요 : ");
        String fileName = sc.nextLine();

        try {
            fr = new FileReader("src/main/java/com/edu/chap11/level01/basic/"+fileName);
            int value;
            while((value = fr.read()) != -1){
                System.out.print((char)value);
            }

        } catch (FileNotFoundException e) {
            System.out.println("해당 이름을 가진 파일이 없습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        sc.close();

    }
}
