package ch17.sec06.exam02;

import java.util.Arrays;

public class MapExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        Arrays.stream(arr)
                .asDoubleStream()
                .forEach(System.out::println);

        Arrays.stream(arr)
                .boxed()
                .forEach(System.out::println);
    }
}