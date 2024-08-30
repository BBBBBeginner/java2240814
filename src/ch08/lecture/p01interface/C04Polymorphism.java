package ch08.lecture.p01interface;

public class C04Polymorphism {
    public static void main(String[] args) {
        // MyClass41과 MyClass42의 인스턴스를 생성하여 method1을 호출
        method1(new MyClass41());
        method1(new MyClass42());
    }

    public static void method1(MyInterface4 param) {
        // 인터페이스를 구현한 클래스의 someMethod를 호출
        param.someMethod();
    }
}

interface MyInterface4 {
    // 인터페이스의 추상 메서드
    void someMethod();
}

class MyClass41 implements MyInterface4 {
    // MyClass41에서 someMethod를 구현
    @Override
    public void someMethod() {
        System.out.println("MyClass41.someMethod");
    }
}

class MyClass42 implements MyInterface4 {
    // MyClass42에서 someMethod를 구현
    @Override
    public void someMethod() {
        System.out.println("MyClass42.someMethod");
    }
}