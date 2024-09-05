package ch16.lecture.p01lambda;

public class C07Parameter {
    public static void main(String[] args) {
        MyInterface7 k = () -> System.out.println();
        k.print();
    }
}


@FunctionalInterface
interface MyInterface7 {
    void print();
}
