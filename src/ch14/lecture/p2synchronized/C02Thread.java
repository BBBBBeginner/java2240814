package ch14.lecture.p2synchronized;

public class C02Thread {
    private static int value = 0;

    private static Object o = new Object(); // lock, monitor


    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                synchronized (o) { //o 를 획득해야만 실행 그 후 반납...
                    value++;
                }

            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                synchronized (o) {
                    value++;
                }

            }
        });
    }
}
