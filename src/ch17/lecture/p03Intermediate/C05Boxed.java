package ch17.lecture.p03Intermediate;

import java.util.Arrays;

public class C05Boxed {
    public static void main(String[] args) {
        // Stream 하고  IntStream, DoubleStream, LongStream 들을 서로 바꿔가며 사용

        // 참조타입원소 Stream을 기본타입원소 Stream
        // : mapToInt, mapToDouble, mapToLong

        // 기본타입원소 Stream을 참조타입원소 Stream
        // : boxed, mapToObj

        int[] nums = {100, 1000, 10, 50, 500};
        Arrays.stream(nums)
                .boxed()
                .forEach(System.out::println);

        Arrays.stream(nums)
                .mapToObj(n -> n + "원")
                .forEach(System.out::println);
    }
}
