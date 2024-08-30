package ch07.lecture.p06final;

public class C01finalMathod {
}

class Fish1 {
    //fival method : 자식 클래스에서 재정의 못함
    final public void breathe() {
        System.out.println("아가미로 호흡함");
    }


    public void swim() {
        System.out.println("헤엄칩니다.");
    }
}

class domi1 extends Fish1 {
    @Override
    //fival method 로 breath method는 자식 클래스에서 재정의 못함
//    public void breathe(){
//    System.out.println("입으로 숨을 쉰다.");

    public void swim() {
        System.out.println("천천히 헤엄칩니다.");
    }
}