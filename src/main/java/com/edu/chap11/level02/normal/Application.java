package com.edu.chap11.level02.normal;

import java.io.*;

public class Application {
    public static void main(String[] args) {
        /*병합할 파일의 개수 입력 : 3
        1 번째 파일 이름 입력 : test.txt
        2 번째 파일 이름 입력 : test2.txt
        3 번째 파일 이름 입력 : test3.txt
        병합 될 파일명 입력 : result.txt
        파일 병합이 완료 되었습니다.

        병합할 파일의 개수 입력 : 2
        1 번째 파일 이름 입력 : test.txt
        2 번째 파일 이름 입력 : test4.txt
        병합 될 파일명 입력 : result.txt
        오류 : test4.txt (지정된 파일을 찾을 수 없습니다)
        * */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("병합할 파일의 개수 입력 : ");
            int n = Integer.parseInt(br.readLine());

            String[] fileNames = new String[n];
            for (int i = 0; i < n; i++) {
                System.out.print((i + 1) + "번째 파일 이름 입력 : ");
                fileNames[i] = br.readLine();
            }

            System.out.println("병합 될 파일명 입력 : ");
            String resultName = br.readLine();

            BufferedWriter bw = new BufferedWriter(new FileWriter(resultName));
            for(String fileName : fileNames) {

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
