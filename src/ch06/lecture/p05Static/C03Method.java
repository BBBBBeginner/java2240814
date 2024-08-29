package ch06.lecture.p05Static;

public class C03Method {
    public static void main(String[] args) {
        MyClass03 o1 = new MyClass03();
    }
}

class MyClass03 {
    //instance
    void method() {
        System.out.println("asd");
    }

    //static (class method 정적 메소드)
    static void method1() {
        System.out.println("s");
    }
}

