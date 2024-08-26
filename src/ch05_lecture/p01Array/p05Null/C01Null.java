package ch05_lecture.p01Array.p05Null;

public class C01Null {
    public static void main(String[] args) {
        // null : 참조하는(가리키는) 객체가 없다.
        String[] a = new String[3];

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);

        a[0].length();//NullPointException

        System.out.println("프로그램 종료");

    }
}
