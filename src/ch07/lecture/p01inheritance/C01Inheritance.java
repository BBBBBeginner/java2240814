package ch07.lecture.p01inheritance;

public class C01Inheritance {
    public static void main(String[] args) {
        SuperClass01 o = new SubClass01();
        o.age = 33;
        o.method1();
    }
}

//상위 클래스, 부모 클래스, 슈퍼클래스
class SuperClass01 {
    int age;

    void method1() {
        System.out.println("MyClass01.method1");
    }
}


//하위 클래스, 자식 클래스 , 서브 클래스
class SubClass01 extends SuperClass01 {
    //age,method
}