package ch07.lecture.p05abstract;

public class C01AbstractClasss {
    public static void main(String[] args) {
        Horse horse1 = new Horse();

        Mammalia bear1 = new Bear();

        Mammalia m1 = new Mammalia(); // x
    }
}


//abstract class : 인스턴스 생성하지 못하는 클래스

// 포유류
class Mammalia {
    public void walk() {
        System.out.println("걷다");
    }
}

class Horse extends Mammalia {
    @Override
    public void walk() {
        System.out.println("말이 걷는다.");
    }
}

//곰

class Bear extends Mammalia {
    @Override
    public void walk() {
        System.out.println("곰이 걷는다.");
    }
}