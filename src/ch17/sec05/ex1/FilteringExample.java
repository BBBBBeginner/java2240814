package ch17.sec05.ex1;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("신용");
        list.add("김자바");
        list.add("홍동우");
        list.add("유진");

        list.stream()
                .distinct()
                .forEach(n -> System.out.println(n));
        System.out.println();

        list.stream()
                .filter(n -> n.startsWith("신"))
                .forEach(n -> System.out.println(n));
        System.out.println();

        list.stream()
                .distinct()
                .filter(n -> n.startsWith("신"))
                .forEach(n -> System.out.println(n));


    }
}
