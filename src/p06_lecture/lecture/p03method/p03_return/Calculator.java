package p06_lecture.lecture.p03method.p03_return;

public class Calculator {
    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    int plus(int x, int y) {
        int r = x + y;
        return r;
    }

    double divide(int x, int y) {
        double r = (double) x / y;
        return r;
    }
}