package ch17.exercise.num6;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", 30),
                new Member("신용권", 40),
                new Member("김자바", 26)
        );

        double avg = list.stream()
                .mapToInt(Member::getAge)  // Member 객체의 나이를 추출
                .average()                 // 평균을 계산
                .orElse(0);                // 결과가 없을 경우 기본값 0

        System.out.println("평균 나이  :" + avg);
    }
}
