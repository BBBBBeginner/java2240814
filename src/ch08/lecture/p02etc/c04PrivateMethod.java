package ch08.lecture.p02etc;

public class c04PrivateMethod {
}

interface MyInterface4 {
    default void method1() {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
    }

    default void method2() {
        System.out.println("4");
        System.out.println("2");
        System.out.println("3");
    }
}
