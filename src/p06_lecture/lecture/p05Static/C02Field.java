package p06_lecture.lecture.p05Static;

public class C02Field {
    public static void main(String[] args) {
//        MyClass02.age = 60;
        MyClass02.name = "son";

        System.out.println("MyClass02.age" + MyClass02.age);
        System.out.println("MyClass02.name" + MyClass02.name);
    }//.out 도 스테틱필드
}

class MyClass02 {
    static int age;
    static String name;
}