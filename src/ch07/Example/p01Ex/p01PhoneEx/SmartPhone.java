package ch07.Example.p01Ex.p01PhoneEx;

// Phone 클래스를 상속받는 SmartPhone 클래스
public class SmartPhone extends Phone {

    // 생성자 정의
    public SmartPhone(String model, String color) {
        // 부모 클래스의 생성자를 호출
        super(model, color);
        System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
    }
}