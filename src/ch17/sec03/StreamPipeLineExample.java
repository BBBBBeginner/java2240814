package ch17.sec03;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("홍길동", 10),
                new Student("신용권", 20),
                new Student("유미선", 30)
        );

        // 1. Stream 만들기
        Stream<Student> stream = list.stream();

        // 2. 중간 연산
        IntStream stream1 = stream.mapToInt(Student -> Student.getScore());

        // 3. 최종 연산
        OptionalDouble average = stream1.average();

        if (average.isPresent()) {
            double avg = average.getAsDouble();
            System.out.println("avg = " + avg);
        }

        // Method chaining으로 한 번에 처리
        double avg1 = list.stream() // 1. 스트림 만들기
                .mapToInt(Student -> Student.getScore()) // 2. 중간 연산
                .average() // 3. 최종 연산
                .orElse(0.0); // 값이 없을 때 기본값 설정

        System.out.println("avg1 = " + avg1);
    }
}