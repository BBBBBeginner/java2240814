package ch07.Example.p01Ex.p01ingeritance_Ex;

public class SmartPhoneExample {

    public static void main(String[] args) {
        // SmartPhone 객체 생성, 모델과 색상 지정
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        // 모델과 색상을 출력
        System.out.println("모델 : " + myPhone.model);
        System.out.println("색상 : " + myPhone.color);

        // 와이파이 상태를 출력
        System.out.println("와이파이 상태 : " + myPhone.wifi);

        // 메소드 호출
        myPhone.bell();                // 벨이 울리는 기능 호출
        myPhone.sendVoice("여보세요"); // 메시지를 보내는 기능 호출
        myPhone.receiveVoice("저는 홍길동"); // 메시지를 받는 기능 호출 (오타 수정)
        myPhone.sendVoice("반갑다");  // 메시지를 다시 보내는 기능 호출
    }
}