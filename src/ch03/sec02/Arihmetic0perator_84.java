package ch03.sec02;

public class Arihmetic0perator_84 {
    public static void main(String[] args) {
        byte v1 = 10;
        byte v2 = 4;
        int v3 = 5;
        long v4 = 10l;
// 착각하기 쉬운것! 바이트 끼리의 연산은 -> 바이트(x) , int(o)


        int result1 = v1 + v2; //모든 피연산자는 int 타입으로 자동 변환 후 연산
        System.out.println("result1: " + result1);

        long result2 = v1 + v2 - v4; //모든 피연산자는 (int가 있지만 가장 큰 타입인)long 타입으로 자동 변환 후 연산
        System.out.println("result2: " + result2);

        double result3 = (double) v1 / v2; //double 타입으로 강제 변환 후 연산. 실수값을 얻기 위해
        System.out.println("result3: " + result3);

        int result4 = v1 % v2;
        System.out.println("result4: " + result4);

    }
}
