package ch02_lecture.CH04_Ex;

public class CastingExample {
    public static void main(String[] args) {
        // 자동 타입 변환
        byte byteValue = 10;
        int intValue = byteValue;  // byte -> int 자동 변환
        System.out.println("intValue: " + intValue);

        char charValue = '가';  // '가'의 유니코드 값이 int로 자동 변환
        intValue = charValue;
        System.out.println("가의 유니코드: " + intValue);

        intValue = 50;
        long longValue = intValue;  // int -> long 자동 변환
        System.out.println("longValue: " + longValue);

        longValue = 100;
        float floatValue = longValue;  // long -> float 자동 변환
        System.out.println("floatValue: " + floatValue);

        floatValue = 100.5F;
        double doubleValue = floatValue;  // float -> double 자동 변환
        System.out.println("doubleValue: " + doubleValue); // float 값을 double로 변환 후 출력
    }
}

