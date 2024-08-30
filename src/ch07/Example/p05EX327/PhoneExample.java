package ch07.Example.p05EX327;

public class PhoneExample {

    public static void main(String[] args) {
//Phone phone  = new Phone(); 안됨
        SmartPhone smartPhone = new SmartPhone("홍길동");


        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();


    }
}
