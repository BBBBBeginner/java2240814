package ch07.lecture.p07protcted.package1;

public class A {

    public void publicMethod() {
        System.out.println("A.publicMethod");
    }

    protected void protectedMethod() {
        System.out.println("A.protectedMethod");
    }

    //같은 패키지에 있으면 사용 가능
    void packagePrivateMethod() {
        System.out.println("A.packagePrivateMethod");
    }
}
