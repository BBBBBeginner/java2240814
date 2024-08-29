package ch07.exercise.p08;

public class TireEx {
    public static void main(String[] args) {
        Tire p = new SnowTire();
        p.method1(); // 출력: "스노우 타이어가 굴러갑니다."
    }
}

class Tire {
    public void method1() {
        System.out.println("타이어는 굴러갑니다.");
    }
}

class SnowTire extends Tire {
    @Override
    public void method1() {
        System.out.println("스노우 타이어가 굴러갑니다.");
    }
}
