package ch14.sec06;

public class SynchronizedExample {
    public static void main(String[] args) throws InterruptedException {
        Calculator calculator = new Calculator();

        User1Thread user1Thread = new User1Thread();
        user1Thread.setCalculator(calculator);

        User2Thread user2Thread = new User2Thread();
        user2Thread.setCalculator(calculator);

        user1Thread.start();
        user2Thread.start();

        user1Thread.join();
        user2Thread.join();

        int memory = calculator.getMemory();
        System.out.println("memory = " + memory);
    }
}