package ch12.lecture.p02Wrapper;

public class C01Wrapper {
    public static void main(String[] args) {
        int a = 1;
        Integer b = new Integer(3);

        //기본타입 a 가 가진 값을
        // 참조타입 c로 변환 (직접 boxing)
        Integer c = Integer.valueOf(a);

        //기본타입 a를 참조타입 d로 변환(자동 auto boxing)
        Integer d = a;

        Long e = 5L; // 대문자 Long -> 인자에L 붙여서 표현 auto boxing
        long f = 5; //소문자 long = 기본타입

        Double g = 3.14; // auto boxing
        Boolean h = true; //auto boxing

        Object i = 9.1234; // auto boxing
    }
}
