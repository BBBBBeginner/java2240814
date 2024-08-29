package ch07.lecture.p04cast;

public class C03InstanceOf {
    public static void main(String[] args) {
        Parent3 a = new Child31();  // Parent3 타입의 객체 a를 Child31 인스턴스로 초기화

        if (a instanceof Child31) {
            Child31 b = (Child31) a;  // a가 Child31 인스턴스이므로 안전한 형변환
            System.out.println("a는 Child31의 인스턴스입니다.");
        }

        if (a instanceof Child32) {
            Child32 c = (Child32) a;  // a가 Child32의 인스턴스가 아니므로 이 블록은 실행되지 않음
            System.out.println("a는 Child32의 인스턴스입니다.");
        }

        System.out.println("다음 코드");
    }
}

class Parent3 {
}

class Child31 extends Parent3 {
}

class Child32 extends Parent3 {
}