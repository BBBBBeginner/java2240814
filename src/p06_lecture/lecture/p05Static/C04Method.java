package p06_lecture.lecture.p05Static;

public class C04Method {
    public static void main(String[] args) {
        MyClass04.method();

        double r = 0;
        System.out.println(r);

        int abs = Math.abs(-99);
        System.out.println(abs);

        System.out.println(Math.PI);
        System.out.println(Math.E);


    }
}

class MyClass04 {
    static void method() {
        System.out.println("MyClass04");
    }
}