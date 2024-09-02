package ch08.lecture.p03Cast;


public class C02Cast {
    public static void main(String[] args) {
        MyInterface2 o = new MyClass21();

        if (o instanceof MyClass21) {
            // o가 MyClass21의 인스턴스인 경우
            MyClass21 a = (MyClass21) o; // 이 캐스팅은 안전하고 유효합니다.
        }

        if (o instanceof MyClass22) {
            // o가 MyClass22의 인스턴스인 경우
            // 이 코드 블록은 실행되지 않습니다. o는 MyClass21의 인스턴스이기 때문입니다.
            MyClass22 b = (MyClass22) o; // 만약 이 코드가 실행되면 ClassCastException이 발생합니다.
        }

        System.out.println("다음코드");
    }
}

//@formatter:off
    interface MyInterface2 {}
    class MyClass21 implements MyInterface2 {}
    class MyClass22 implements MyInterface2 {}
