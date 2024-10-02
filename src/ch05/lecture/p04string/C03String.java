package ch05.lecture.p04string;

public class C03String {
    public static void main(String[] args) {
        String a = new String("java");
        String b = "java";
        String c = new String("java");
        String d = "java";

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("ch05_lecture.p01Array.a.c = " + c);
        System.out.println("d = " + d);

        // 문자열 비교 == 사용하지 말것!
        System.out.println(a == b);
        System.out.println(b == d);
        System.out.println(a == c);

        // 문자열 비교시 equlas 사용!
        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
        System.out.println(c.equals(d));
    }
}
