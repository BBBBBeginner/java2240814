package ch17.sec12.exam2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("홍길동", "남", 92),
                new Student("김수영", "여", 87),
                new Student("감자바", "남", 95),
                new Student("오해영", "여", 93)
        );

        Map<String, List<Student>> map = list.stream()
                .collect(Collectors.groupingBy(Student::getSex));

        map.forEach((k, v) -> System.out.println(k + ":" + v));
    }
}