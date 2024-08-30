package ch08.lecture.p01interface;

public class C05Polymorphism {
    public static void main(String[] args) {
        // method()를 호출하여 MyInterface5 타입의 객체를 얻음
        MyInterface5 m = method();
        // someAction() 메서드를 호출
        m.someAction();
    }

    // method() 메서드는 MyInterface5 타입을 반환
    static MyInterface5 method() {
        double r = Math.random();
        // 0.5보다 작으면 MyClass51의 인스턴스를 반환
        if (r < 0.5) {
            return new MyClass51();
        }
        // 그렇지 않으면 MyClass52의 인스턴스를 반환
        return new MyClass52();
    }
}

// 인터페이스 선언
interface MyInterface5 {
    // someAction() 메서드 선언
    void someAction();
}

// MyInterface5를 구현하는 클래스 MyClass51
class MyClass51 implements MyInterface5 {
    @Override
    public void someAction() {
        // MyClass51의 someAction() 메서드 구현
        System.out.println("MyClass51.someAction");
    }
}

// MyInterface5를 구현하는 클래스 MyClass52
class MyClass52 implements MyInterface5 {
    @Override
    public void someAction() {
        // MyClass52의 someAction() 메서드 구현
        System.out.println("MyClass52.someAction");
    }
}