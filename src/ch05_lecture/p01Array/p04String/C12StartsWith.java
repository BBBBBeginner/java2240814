package ch05_lecture.p01Array.p04String;

public class C12StartsWith {
    public static void main(String[] args) {
        String s = "java language";
        int i = s.indexOf("java");
        if (i == 0) {
            System.out.println("시작 문자열");
        }
        boolean j = s.startsWith("java");
        if (j) {
            System.out.println("시작 문자열");
        }

        int k = s.indexOf("age");
        System.out.println("k = " + k);
        System.out.println(s.length() - "age".length());

        boolean l = s.endsWith("age"); // true
        System.out.println("l =" + l);
    }
}
