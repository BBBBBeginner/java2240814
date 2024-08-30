package ch07.lecture.p07protcted.package2;

import ch07.lecture.p07protcted.package1.A;

public class C {
    public void someMethod() {
        A a = new A();
        a.publicMethod();
//        a.protectedMethod();
//        a.packagePrivateMethod();
    }
}
