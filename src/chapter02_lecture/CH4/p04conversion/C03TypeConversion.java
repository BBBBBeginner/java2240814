package chapter02_lecture.CH4.p04conversion;

public class C03TypeConversion {
    public static void main(String[] args) {
        // 정수(byte, short,int,long) <-> 실수 (float,double)
        // 정수(int,long) <-> 실수(double)

        long a = 50000;
        double b = a;//자동형변환 ok

        double c = 50000;
        long d = (long) c; // 자동형 변환 x ,강제형변환 ok

        //소수점 이하의  값을 버릴 때 주로 사용
        double e = 3.14;
        int f = (int) e;
    }
}
