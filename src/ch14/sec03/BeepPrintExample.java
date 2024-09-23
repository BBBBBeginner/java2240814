package ch14.sec03;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) throws InterruptedException {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 5; i++) {

                        toolkit.beep();
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            Thread.sleep(1000);
        }

    }
}