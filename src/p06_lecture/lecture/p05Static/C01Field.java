package p06_lecture.lecture.p05Static;

public class C01Field {
    public static void main(String[] args) {
        MyClass01 o1 = new MyClass01();
        MyClass01 o2 = new MyClass01();
        o1.age = 30;
        o2.age = 40;
        System.out.println(o1.age);
        System.out.println(o2.age);

        MyClass01.number = 50;
        System.out.println(MyClass01.number);
    }
}

class MyClass01 {
    int age; // instance field
    //인스턴스 있어야 가능


    static int number; //static field(class field, 정적 필드)
    //인스턴스 없어도 가능
}
