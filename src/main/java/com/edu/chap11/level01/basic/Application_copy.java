package com.edu.chap11.level01.basic;

import java.io.*;

public class Application_copy {
    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         * (원본 파일이 존재 하는 경우)
         * 원본 파일의 이름을 입력하세요 : origin.txt
         * 복사 파일의 이름을 입력하세요 : copy.txt
         *
         * ----- 출력 예시 -----
         * 파일 복사가 성공적으로 완료 되었습니다.
         *
         * ----- 입력 예시 -----
         * (원본 파일이 존재하지 않는 경우)
         * 원본 파일의 이름을 입력하세요 : origin2.txt
         * 복사 파일의 이름을 입력하세요 : copy2.txt
         *
         * ----- 출력 예시 -----
         * 오류 : origin2.txt (지정된 파일을 찾을 수 없습니다)
         */
        FileReader fr = null;
        FileWriter fw = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ori = null;

        try {
            System.out.print("원본 파일의 이름을 입력하세요 : ");
            /*String*/ ori = br.readLine();
            System.out.print("복사 파일의 이름을 입력하세요 : ");
            String copy = br.readLine();

            fr = new FileReader("src/main/java/com/edu/chap11/level01/basic/"+ori);
            fw = new FileWriter("src/main/java/com/edu/chap11/level01/basic/"+copy);

            int value;
            while((value = fr.read()) != -1){
                fw.write(value);
            }

            fw.flush();
            System.out.println("파일 복사가 성공적으로 완료 되었습니다.");

            br.close();

        } catch (FileNotFoundException e){
            System.out.printf("오류 : %s (지정된 파일을 찾을 수 없습니다)", ori);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
