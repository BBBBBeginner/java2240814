package ch05_lecture.p01Array.p01Enum;

public class C02Enum {
    public static void main(String[] args) {
        Enum2 season = Enum2.FALL;

        if (season.equals(Enum2.FALL)) {
            System.out.println("가을에 관련된 코드...");
        }
    }
}

enum Enum2 {
    SPRING, SUMMER, FALL, WINTER
}