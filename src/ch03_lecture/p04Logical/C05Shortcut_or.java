package ch03_lecture.p04Logical;

public class C05Shortcut_or {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        System.out.println((a++) > 0 || (b++) < 0);

        System.out.println("a =" + a);
        System.out.println("b =" + b);

        int c = 5;
        int d = 5;
        System.out.println((c++) > 0 | (d++) < 0);
        System.out.println("ch05_lecture.p01Array.a.c =" + c);
        System.out.println("d =" + d);
    }
}
