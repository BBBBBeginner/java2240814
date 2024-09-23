package ch14.sec03;

import java.awt.*;

public class BeepPrintExample2 {
    public static void main(String[] args) {
        // 새 스레드를 생성하여 '띵' 소리를 내는 작업을 처리
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit(); // 소리 내기 위한 Toolkit 객체 생성
                for (int i = 0; i < 5; i++) {
                    toolkit.beep(); // '띵' 소리
                    try {
                        Thread.sleep(500); // 0.5초 대기
                    } catch (Exception e) {
                        e.printStackTrace(); // 예외 발생 시 스택 트레이스 출력
                    }
                }
            }
        });

        // 스레드 시작 (별도로 소리 내는 작업 시작)
        thread.start();

        // 메인 스레드에서 동시에 콘솔에 메시지를 출력
        for (int i = 0; i < 5; i++) {
            System.out.println("띵"); // 메시지 출력
            try {
                Thread.sleep(500); // 0.5초 대기
            } catch (Exception e) {
                e.printStackTrace(); // 예외 발생 시 스택 트레이스 출력
            }
        }
    }
}