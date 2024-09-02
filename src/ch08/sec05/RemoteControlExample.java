package ch08.sec05;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;

        // Television 객체 생성 및 메서드 호출
        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.setMute(true);
        rc.setMute(false);
        System.out.println();

        // Audio 객체 생성 및 메서드 호출
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
        rc.setMute(true);
        rc.setMute(false);
        System.out.println();

        // 정적 메서드 호출
        RemoteControl.changeBattery();
    }
}