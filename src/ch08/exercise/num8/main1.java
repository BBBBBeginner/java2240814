package ch08.exercise.num8;

public class main1 {
    public static void main(String[] args) {
        Example.action(new B());
        Example.action(new C());
    }
}


interface A {
    public void method1();
}

class B implements A {
    @Override
    public void method1() {
        System.out.println("B = method1()");
    }
}

class C implements A {
    @Override
    public void method1() {
        System.out.println("C - method1()");
    }

    public void method2() {
        System.out.println("C - method2()");
    }
}

class Example {
    public static void action(A a) {
        a.method1();
        if (a instanceof C c) {
            c.method2();
        }
    }

}