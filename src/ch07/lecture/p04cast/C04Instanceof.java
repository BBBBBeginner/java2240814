package ch07.lecture.p04cast;

public class C04Instanceof {
    public static void main(String[] args) {
        //instanceof
        //결과 : boolean
        // 왼쪽항 : 참조변수
        // 오른쪽항 : 타입(클래스, 인터페이스)
        // 왼쪽의 참조변수가 가리키는 인스턴스를 오른쪽 타입이면 true
        System.out.println("\nA객체");
        A a = new A();
        System.out.println(a instanceof A);
        System.out.println(a instanceof B);
        System.out.println(a instanceof C);
        System.out.println(a instanceof D);
        System.out.println(a instanceof E);
        System.out.println(a instanceof F);

        System.out.println("\nB객체");
        B b = new B();
        System.out.println(b instanceof A);
        System.out.println(b instanceof B);
//        System.out.println(b instanceof C);
        System.out.println(b instanceof D);
        System.out.println(b instanceof E);
//        System.out.println(b instanceof F);

        System.out.println("\nA객체");
        C c = new C();
        System.out.println(c instanceof A);
//        System.out.println(c instanceof B);
        System.out.println(c instanceof C);
//        System.out.println(c instanceof D);
//        System.out.println(c instanceof E);
        System.out.println(c instanceof F);


    }
}

// @formatter:off
class A{}
class B extends A{}
class C extends A{}

class D extends B{}
class E extends B{}

class F extends C{}