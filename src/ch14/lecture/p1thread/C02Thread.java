package ch14.lecture.p1thread;

import java.awt.*;

public class C02Thread {
    public static void main(String[] args) throws InterruptedException {
        Toolkit toolkit = Toolkit.getDefaultToolkit();


        // 첫 번째 스레드 (띵 소리 내기)
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    toolkit.beep(); // '띵' 소리
                    try {
                        Thread.sleep(1000); // 1초 멈춤
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        // 두 번째 스레드 (콘솔에 메시지 출력)
        Thread t2 = new MyThread1();

        t1.start();
        t2.start();
    }
}

// 스레드 클래스
class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("띠링");
            try {
                Thread.sleep(1000); // 1초 멈춤
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}