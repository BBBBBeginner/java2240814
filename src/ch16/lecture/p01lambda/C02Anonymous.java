package ch16.lecture.p01lambda;

public class C02Anonymous {
    public static void main(String[] args) {
        MyInterface2 o = new MyInterface2() {
            @Override
            public void someAction() {
                System.out.println("추상메소드 재정의");
            }
        };

        o.someAction();
//람다식 : 어차피 추상메서드 하나밖에 없으면 누가 봐도 그 익명 클래스는 추상 메서드의 것이다.
//그러니 과감하게 요약할것은 요약하고 ,
// 추상메서드 주인인 인터페이스 이름과 파라미터 그리고 괄호와 화살표만으로 메서드 꾸밈
        MyInterface2 p =
                () -> {
                    System.out.println("오버라이드 추상 메소드");
                };

        p.someAction();
    }
}

interface MyInterface2 {
    void someAction();
}