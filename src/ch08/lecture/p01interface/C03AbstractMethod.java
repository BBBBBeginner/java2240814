package ch08.lecture.p01interface;

public class C03AbstractMethod {
    public static void main(String[] args) {
        // MyInterface3 타입의 o 변수에 MyClass3의 인스턴스를 할당
        MyInterface3 o = new MyClass3();
        // o 객체의 someMethod를 네 번 호출
        o.someMethod();
        o.someMethod();
        o.someMethod();
        o.someMethod();
    }
}

// 인터페이스 MyInterface3 선언
interface MyInterface3 {
    // 인터페이스의 메서드는 기본적으로 public abstract 메서드
    // 메서드 선언: 인터페이스를 구현하는 클래스에서 반드시 구현해야 함
    public abstract void someMethod(); // 명시적으로 public abstract를 사용한 메서드

    // public 생략 가능: 생략해도 컴파일러가 자동으로 public으로 간주
    abstract void otherMethod1();

    // abstract 생략 가능: 생략해도 컴파일러가 자동으로 abstract로 간주
    public void otherMethod2();

    // public과 abstract 모두 생략 가능
    void otherMethod3();
}

// MyInterface3를 구현하는 클래스 MyClass3
class MyClass3 implements MyInterface3 {
    // MyInterface3의 someMethod 메서드를 구현
    @Override
    public void someMethod() {
        // someMethod 호출 시 출력되는 메시지
        System.out.println("someMethod implemented");
    }

    // MyInterface3의 otherMethod1 메서드를 구현
    @Override
    public void otherMethod1() {
        // otherMethod1 호출 시 출력되는 메시지
        System.out.println("otherMethod1 implemented");
    }

    // MyInterface3의 otherMethod2 메서드를 구현
    @Override
    public void otherMethod2() {
        // otherMethod2 호출 시 출력되는 메시지
        System.out.println("otherMethod2 implemented");
    }

    // MyInterface3의 otherMethod3 메서드를 구현
    @Override
    public void otherMethod3() {
        // otherMethod3 호출 시 출력되는 메시지
        System.out.println("otherMethod3 implemented");
    }
}
