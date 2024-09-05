package ch09.sec02.ex1;

public class A {
    //인스턴스 맴버
    class B {
    }

    //인스턴스 필드값으로 B객체 대입
    B field = new B();

    //생성자
    A() {
        B b = new B();
    }

}
