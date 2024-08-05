package com.edu.chap06.level01.basic.student.run;

import com.edu.chap06.level01.basic.student.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /*// 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
        // while문을 사용하여 학생들의 정보를 계속 입력 받고
        // 한 명씩 추가 될 때마다 카운트함
        // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
        // 3명 정도의 학생 정보를 입력 받아 각 객체에 저장함
        // 현재 기록된 학생들의 각각의 점수 평균을 구함
        // 학생들의 정보를 모두 출력 (평균 포함)
        *
        * 학년 : 1
            반 : 5
            이름 : 홍길동
            국어점수 : 40
            영어점수 : 60
            수학점수 : 70
            계속 추가할 겁니까 ? (y/n) : y
        * */

        StudentDTO[] students = new StudentDTO[10];
        int cnt = 0;
        Scanner sc = new Scanner(System.in);

        while (cnt < 10){
            System.out.print("학년 : ");
            int grade = sc.nextInt();
            System.out.print("반 : ");
            int classroom = sc.nextInt();
            sc.nextLine();
            System.out.print("이름 : ");
            String name = sc.nextLine();
            System.out.print("국어점수 : ");
            int kor = sc.nextInt();
            System.out.print("영어점수 : ");
            int eng = sc.nextInt();
            System.out.print("수학점수 : ");
            int math = sc.nextInt();

            students[cnt] = new StudentDTO(grade, classroom, name, kor, eng, math);
            cnt++;

            System.out.print("계속 추가할 겁니까 ? (y/n)  : ");
            char answer = sc.next().charAt(0);
            if (answer == 'y' || answer == 'Y'){
                continue;
            }else {
                break;
            }

        }

        for(int i = 0; i< cnt; i++){
            System.out.println(students[i].getInformation());
        }
//        for (StudentDTO student : students) {
//                System.out.println(student.getInformation());
//        }
        sc.close();
    }
}
