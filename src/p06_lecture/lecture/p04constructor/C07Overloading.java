package p06_lecture.lecture.p04constructor;

public class C07Overloading {
    public static void main(String[] args) {
        MyClass07 o = new MyClass07(1, 44, "son", "seoul");
        MyClass07 q = new MyClass07("lee", "london");
    }
}

class MyClass07 {

    int id;
    int age;
    String name;
    String address;

    MyClass07(int id, int age, String name, String address) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.address = address;
    }

    MyClass07(String name, String address) {
        this.id = id;
        this.age = age;
    }
}
