package ch08.sec11.exam1;

public class KumhoTire implements Tire {
    //추상 메소드 재정의
    @Override
    public void roll() {
        System.out.println("금호타이어가 굴러갑니다.");
    }

}
