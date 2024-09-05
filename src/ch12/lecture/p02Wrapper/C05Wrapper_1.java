package ch12.lecture.p02Wrapper;

public class C05Wrapper_1 {
    public static void main(String[] args) {
        Integer a = 5000;
        Integer b = 7000;
        Integer c = 5000;

        System.out.println(a = b); // true
        System.out.println(a <= c); // false

    }
}