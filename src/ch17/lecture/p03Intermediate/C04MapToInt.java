package ch17.lecture.p03Intermediate;

import java.util.List;

public class C04MapToInt {
    public static void main(String[] args) {
        // 객체 스트림을 **IntStream**으로 변환하기 위해 사용
        List<String> list = List.of("java", "css", "spring", "react", "boots");

        list.stream()
                .mapToInt(e -> e.length())//문자열의 길이 수로 반환 ex)"java" =4
                .forEach(System.out::println);


    }
}
