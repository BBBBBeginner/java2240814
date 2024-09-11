package ch17.sec01.ex1;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

// set 원소 추가
        set.add("홍길동");
        set.add("신용권");
        set.add("감자바");

        //stream요소 반복처리
        Stream<String> stream = set.stream();
        stream.forEach(name -> System.out.println(name));
    }
}
