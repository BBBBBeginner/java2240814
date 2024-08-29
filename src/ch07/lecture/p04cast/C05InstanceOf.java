package ch07.lecture.p04cast;

public class C05InstanceOf {
    public static void main(String[] args) {
        A a = new B();

        if (a instanceof B) {
            B b = (B) a;
            // B의 메소드 실행...
        }

        if (a instanceof B) {
            B b = (B) a;
            // B의 메소드 실행...
        }

        if (a instanceof C c) { // 이렇게 줄일 수 있음.
            // C의 메소드 실행 코드들...
        }
    }
}
