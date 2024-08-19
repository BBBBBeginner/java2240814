package chapter02_lecture.CH4.p04conversion;

public class C01TypeConversion {
    public static void main(String[] args) {
        // Type conversion(형변환)

        // 자동: 작은 공간의 값 -> 큰 공간으로 변환
        // 강제: 큰 공간의 값 -> 작은 공간으로 변환

        // 자동 형변환
        // 정수형 사이
        int a = 30000;
        long b = a; // 자동 형변환 OK
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 강제 형변환: 매우 주의해서 사용해야 함
        short c = (short) a; // 강제 형변환, 값 손실 위험 있음
        System.out.println("c = " + c);

        int d = 2_100_000_000;
        short e = (short) d; // 강제 형변환, 값 손실 발생
        System.out.println("e = " + e); // 예상하지 못한 값 출력
    }
}
