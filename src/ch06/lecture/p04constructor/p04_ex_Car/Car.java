package ch06.lecture.p04constructor.p04_ex_Car;

public class Car {

    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    Car(String model) {
        //20라인 생성자 호출
        this(model, "은색", 350);
    }

    Car(String model, String color) {
        //20라인 생성자 호출
        this(model, color, 350);
    }

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}


