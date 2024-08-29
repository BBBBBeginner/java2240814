package ch06.lecture.p06final.po6_ex_Korean;

public class KoreanExample {
    public static void main(String[] args) {

        Korean k1 = new Korean("12345-12345", "감자바");

        //
        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        k1.name = "감자바";
    }
}
