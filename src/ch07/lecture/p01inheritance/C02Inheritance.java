package ch07.lecture.p01inheritance;

public class C02Inheritance {
}

class ParentClass02 {
    private String name;
    private int age;

    // 부모 클래스의 생성자: 매개변수를 받아서 필드를 초기화합니다.
    ParentClass02(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class ChildClass02 extends ParentClass02 {
    // 자식 클래스의 생성자: 부모 클래스의 생성자를 호출하여 필드를 초기화합니다.
    ChildClass02(String name, int age) {
        // 부모 클래스 필드에 접근할 수 없기 때문에 -> 대부분 private라서
        // this.name = name;
        // this.age = age;

        // 자식 클래스 생성자에서는
        // 꼭 부모 클래스 생성자를 호출해서
        // 필드 초기화를 해야 합니다.
        super(name, age); // 부모 클래스 생성자 호출
    }

    void method() {
        // private 필드에 직접 접근할 수 없기 때문에 getter 메서드를 사용할 수 있습니다.
        // 하지만 현재 코드에는 getter 메서드가 정의되어 있지 않습니다.
        // this.name; // 접근 불가
    }
}