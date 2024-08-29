package ch06.lecture.p05Static;

public class C06Member {

}
//static field : 모두가 공유하는 공간 _ 클래스에 속하며 , 모든 객체가 공유하는 변수
//* 스태틱 필드는 생성자에서 초기화 하지 않음
//instance field : 각자의 공간 _ 각 객체마다 독립적으로 가지는 변수, 값 변경해도 다른 객체에 영향을 주지 않음

//static method : 클래스 전체에 적용 , 계산기 코딩과 같이 변수가 바뀌며 선언하는 method에 사용
//instance field :특정 메소드에만 적용,  특정 정보 조회 할때와 같은 코드를 짤때 사용

//member : field, method, (생성자)
// static member 에서 instance member 에 접근 불가능
// instance member 는 static member 에 접근 가능

class Myclass06 {
    static int number;
    int age;

    static void method1() {
        System.out.println(number); //ok
        //     System.out.println(age); //not ok
    }

    void method2() {
        System.out.println(number); //ok
        System.out.println(age); //ok
    }
}
