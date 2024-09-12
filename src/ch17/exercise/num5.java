package ch17.exercise;

import java.util.Arrays;
import java.util.List;

public class num5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "this is a java book",
                "Lamda Expression",
                "java8 su[[ort Lambda expressions"
        );
        list.stream()
                .filter(str -> str.contains("java"))
                .forEach(System.out::println);
    }
}