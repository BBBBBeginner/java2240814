package ch05_lecture.p01Array.p04String;

public class C06CharAt {
    public static void main(String[] args) {
        // charAt : 명시된 인덱스의 char value를 계산한다.
        String s = "java programming language";
        System.out.println(s.length());//25
        System.out.println(s.charAt(0));//j
        System.out.println(s.charAt(1)); //a
        System.out.println(s.charAt(s.length() - 1)); //e

        char c = s.charAt(5);
        System.out.println(c); //p
    }
}
