package ch16.lecture.p01lambda;


public class C04FunctionalInterface {
}

//x
@FunctionalInterface
interface MyInterface4 {
    void method1();
}

//x
//@FunctionalInterface
interface MyInterface42 {

}

//x
//@FunctionalInterface
interface MyInterface43 {
    void method1();

    void method2();
}

@FunctionalInterface
interface MyInterface44 {
    int MAX_VALUE = 100;

    void method1();

    default void method2() {
    }

    private void method3() {
    }

    static void method4() {
    }

    private static void method5() {
    }
}