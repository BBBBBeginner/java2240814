package ch07.lecture.p04cast;

public class C02Cast {
    public static void main(String[] args) {
        Parent2 p = new Child21(); // 자동형변환 (Upcasting)
        Child21 c = (Child21) p;  // 강제형변환 (Downcasting)

        Parent2 q = new Child22(); // 자동형변환 (Upcasting)
        // 강제형변환을 시도할 수 있지만, Child22를 Child21로 변환하려고 하면 예외 발생
        // 강제 종료 될 수도

//        try {
//            Child21 d = (Child21) q; // 강제형변환 시도 (ClassCastException 발생 가능)
//        } catch (ClassCastException e) {
//            System.out.println("형변환 오류: " + e.getMessage());
//        }
//
        System.out.println("프로그램 종료");
    }
}

class Parent2 {
}

class Child21 extends Parent2 {
}

class Child22 extends Parent2 {
}