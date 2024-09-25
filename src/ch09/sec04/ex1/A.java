package ch09.sec04.ex1;

public class A {
    public A() {
        class B {
        }
        B b = new B();
    }

    void method() {
        class B {
        }
        B b = new B();
    }
}