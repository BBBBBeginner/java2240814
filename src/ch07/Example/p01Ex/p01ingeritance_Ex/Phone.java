package ch07.Example.p01Ex.p01ingeritance_Ex;

// Phone 클래스를 정의합니다.
public class Phone {
    // 모델과 색상 속성을 선언합니다.
    public String model;
    public String color;

    // 벨이 울리는 메소드
    public void bell() {
        System.out.println("벨이 울립니다.");
    }

    // 메시지를 보내는 메소드
    public void sendVoice(String message) {
        System.out.println("자기: " + message);
    }

    // 메시지를 받는 메소드
    public void receiveVoice(String message) {
        System.out.println("상대방: " + message);
    }

    // 전화를 끊는 메소드
    public void hangUp() {
        System.out.println("전화를 끊습니다.");
    }
}