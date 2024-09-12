package ch17.sec06.exam01;

import java.util.List;
import java.util.OptionalDouble;

public class MapExample {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("홍길동", 85),
                new Student("홍길동", 92),
                new Student("홍길동", 87));

        list.stream()
                .mapToInt(Student::getScore)
                .forEach(System.out::println);

        OptionalDouble avg = list.stream()
                .mapToInt(Student::getScore)
                .average();

        System.out.println("avg.getAsDouble() = " + avg.getAsDouble());
    }
}