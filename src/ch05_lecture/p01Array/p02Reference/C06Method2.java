package ch05_lecture.p01Array.p02Reference;

public class C06Method2 {
    public static void main(String[] args) {
        int b = 5;
        System.out.println(b);
        method1(b);
        System.out.println(b);
    }

    public static void method1(int a) {
        System.out.println(a);
        a = 55;
        System.out.println(a);
    }
}
