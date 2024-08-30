package ch07.lecture.p07protcted.package2;

import ch07.lecture.p07protcted.package1.A;

public class D extends A {
    // publicMethod
    // protectedMethd
    // packagePrivateMethod

    public void someMethod() {
        publicMethod();//ok
        protectedMethod(); //ok
//        packagePrivateMethod();//x
    }

}
