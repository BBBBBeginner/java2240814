package p06_lecture.lecture.p04constructor;

public class C02Constructor {
    public static void main(String[] args) {
        MyClass03 o1 = new MyClass03(1, "guest");
        System.out.println(o1.age);
        System.out.println(o1.name);

    }
}

class MyClass03 {
    int age;
    String name;


    MyClass03(int ageParam, String nameParam) {
        age = ageParam;
        name = nameParam;
    }
}