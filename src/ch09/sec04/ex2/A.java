package ch09.sec04.ex2;

public class A {
    void useB() {
        class B {
            int field1 = 1;
            static int field2 = 2;

            public B() {
                System.out.println("B.B");
            }

            void method1() {
                System.out.println("B.method1");
            }

            static void method2() {
                System.out.println("B.method2");
            }
        }

        B b = new B();
        System.out.println(b.field1);
        b.method1();

        System.out.println(B.field2);
        B.method2();
    }
}