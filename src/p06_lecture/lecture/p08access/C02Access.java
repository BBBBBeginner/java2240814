package p06_lecture.lecture.p08access;

public class C02Access {
    public static void main(String[] args) {
        MyClass02 o = new MyClass02();
//      o.name = "길동"; // 불가
        o.age = 30;
        o.address = "seoul";
    }
}
// access modifier : 접근제한자(접근지정자)
// 맴버(필드, 생성자, 메소드) , 클래스의 접근 범위를 지정해주는 키워드

// public, protected, (package private, default), private
// public : 어디서든 접근 가능
// (package private, default) : 같은 패키지 내에서만 접근 가능
// private :  클래스 내에서만 접근 가능
class MyClass02 {
    public int age;
    String address; //default
    private String name;

    void method1() {
        System.out.println(age);
        System.out.println(address);
        System.out.println(name);
    }

}


