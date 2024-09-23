package ch15.sec04.exam1;

import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {
    public static void main(String[] args) throws InterruptedException {
        Map<String, Integer> map = new Hashtable<>();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map.put("!" + i, 1);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map.put("@" + i, 1);
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("map.size() = " + map.size());
    }
}