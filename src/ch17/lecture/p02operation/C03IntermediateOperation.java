package ch17.lecture.p02operation;

import java.util.List;
import java.util.stream.Stream;

public class C03IntermediateOperation {
    public static void main(String[] args) {
        // 중간 연산

        List<Integer> list = List.of(3, 1, 4, 1, 5, 9, 2); // 스트림 생성

        // limit의 경우 예시
        System.out.println("-limit-");

        //1. 스트림 생성
        Stream<Integer> stream = list.stream();// 스트림 생성

        // 2.중간 연산(limit 메서드 적용)
        // stream.limit(3) 메서드를 사용하여 원본 스트림 (stream)에서
        // 최대 3개의 요소만 포함하는 새로운 스트림 객체 limit을 생성합니다.
        Stream<Integer> limit = stream.limit(3); //


        // 3. 최종연산(출력)
        // limit.forEach(System.out::println) 메서드를 사용하여
        // limit 스트림의 각 요소를 콘솔에 출력합니다.
        limit.forEach(System.out::println);


        // sorted
        System.out.println("-sorted-");
        Stream<Integer> stream1 = list.stream();
        Stream<Integer> sorted = stream1.sorted();
        sorted.forEach(System.out::println);

        // map
        System.out.println("-map-");
        Stream<Integer> stream2 = list.stream();
        Stream<Integer> stream3 = stream2.map(i -> i * 2);
        stream3.forEach(System.out::println);

        // distinct
        System.out.println("-distinct-");
        Stream<Integer> stream4 = list.stream();
        Stream<Integer> distinct = stream4.distinct();
        distinct.forEach(System.out::println);

        // skip
        System.out.println("-skip-");
        Stream<Integer> stream5 = list.stream();
        Stream<Integer> skip = stream5.skip(2);
        skip.forEach(System.out::println);


    }
}