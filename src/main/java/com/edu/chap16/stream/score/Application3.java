package com.edu.chap16.stream.score;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Application3 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("철수", "수학", 95),
                new Student("철수", "영어", 80),
                new Student("영희", "수학", 90),
                new Student("영희", "영어", 91),
                new Student("민수", "수학", 85),
                new Student("민수", "영어", 88)
        );

        // 1. 각 학생의 평균 점수를 계산하여 맵으로 반환
        Map<String, Double> averageScoreByStudent = students.stream()
                .collect(Collectors.groupingBy(Student::getName, Collectors.averagingDouble(Student::getScore)));

        System.out.println(averageScoreByStudent);

        // 2. 특정 과목(수학)에서 90점 이상 받은 학생의 이름을 리스트로 반환
        List<String> highScorersInMath = students.stream()
                .filter(s -> s.getSubject().equals("수학") && s.getScore() >= 90)
                .map(s -> "\"" + s.getName() + "\"")
                .collect(Collectors.toList());

        System.out.println(highScorersInMath);

        // 3. 가장 높은 평균 점수를 가진 학생의 이름을 반환
        String topStudent = averageScoreByStudent
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(entry -> "\"" + entry.getKey() + "\"")
                .orElse("");

        System.out.println(topStudent);

    }
}