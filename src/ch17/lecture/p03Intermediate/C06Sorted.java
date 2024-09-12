package ch17.lecture.p03Intermediate;

import java.util.Comparator;
import java.util.List;

public class C06Sorted {
    public static void main(String[] args) {
        List<Integer> list = List.of(6, 1, 9, 0, 10, 1, 3, 7);

        list.stream()
                .sorted() //정렬기준에 따라 정렬
                .forEach(System.out::println);
        // .forEach메서드 : 컬렉션.forEach(요소 -> 요소를 이용한 작업 수행});


        System.out.println("-Comparator 사용-");
        list.stream()
                .sorted((a, b) -> b - a)
                .forEach(System.out::println);


        System.out.println("-Comparator.reverseOrder 사용-");
        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }
}
