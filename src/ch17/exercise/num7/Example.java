package ch17.exercise.num7;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Member> list = List.of(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );

        // 고전적 방법
        List<Member> devs = new ArrayList<>();
        for (Member m : list) {
            if (m.getJob().equals("개발자")) {
                devs.add(m);
            }
        }
        devs.forEach(m -> System.out.println(m.getName()));

        // stream
        List<Member> devs2 = list.stream()
                .filter(m -> m.getJob().equals("개발자"))
                .toList();

        devs2.stream()
                .forEach(m -> System.out.println(m.getName()));
    }
}