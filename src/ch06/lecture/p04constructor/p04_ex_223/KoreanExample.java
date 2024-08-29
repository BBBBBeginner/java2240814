package ch06.lecture.p04constructor.p04_ex_223;

public class KoreanExample {
    public static void main(String[] args) {
        //Korean 객체 생성
        Korean_223 k1 = new Korean_223("박자바", "0112255-1234567");

        //Korean 객체 데이터 읽기
        System.out.println("k1.nation : " + k1.nation);
        System.out.println("k1.name : " + k1.name);
        System.out.println("k1.ssn : " + k1.ssn);
        System.out.println();

        //또 다른 Korean 객체 생성
        Korean_223 k2 = new Korean_223("박이썬", "950605-0626504");

        //객체 데이터 읽기
        System.out.println("k2.nation : " + k2.nation);
        System.out.println("k2.name : " + k2.name);
        System.out.println("k2.ssn : " + k2.ssn);
        System.out.println();

    }
}
