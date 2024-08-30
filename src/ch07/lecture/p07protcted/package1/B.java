package ch07.lecture.p07protcted.package1;

public class B {
    public void someMethod() {
        A a = new A();
        a.publicMethod();
        a.protectedMethod();
        a.packagePrivateMethod();
    }
}