package ch05.p01Array.p01Array;

public class C02Array {
    public static void main(String[] args) {

        int[] a; // a라는 배열 변수 선언
        a = new int[3]; //3개의 값을 저장 가능한 공간 생성

        a[0] = 33;
        a[1] = 44;
        a[2] = 55;
//        a[3] = 77;

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
//        System.out.println(a[3]);
    }
}
