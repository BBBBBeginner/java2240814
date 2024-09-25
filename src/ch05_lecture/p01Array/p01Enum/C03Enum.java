package ch05_lecture.p01Array.p01Enum;

public class C03Enum {
    public static void main(String[] args) {
        Season s = Season.SPRING;
        System.out.println(s.name());
        System.out.println(s.ordinal());
        System.out.println(s.toString());

        s.method();

        Season s2 = Season.valueOf("FALL");
        System.out.println(s2.name());
        System.out.println(s2.ordinal());
        System.out.println(s2);
    }
}

enum Season {
    SPRING,
    SUMMER,
    FALL,
    WINTER;

    public void method() {
        System.out.println("Season.method");
    }
}
