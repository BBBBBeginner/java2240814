package ch14.lecture.p2synchronized;

public class C01Thread {
    private static int value = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                value++;
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                value++;
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("value = " + value); // 예측 불가능한 값일 수 있음
    }
}