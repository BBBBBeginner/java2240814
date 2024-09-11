package ch17.lecture.p02operation;

import java.util.Random;
import java.util.stream.IntStream;

public class C02Stream {
    public static void main(String[] args) {
        IntStream stream = IntStream.range(0, 5); // 0 ~ 4 (1. Intstream 생성)
        int sum = stream.sum();// 3. 최종연산 , 중간연산 생략
        System.out.println("sum = " + sum);

        Random random = new Random();
        IntStream randomStream = random.ints(); // 1. IntStream 생성
        randomStream.distinct()                 // 2. 중간연산 14줄 부터 ~ 16번쨰 줄 까지
                .filter(n -> 1 <= n && n <= 45)
                .limit(6)
                .forEach(System.out::println);  // 3. 최종연산


//        IntStream randomStream = random.ints(1, 46);
//        randomStream.distinct()
//                .limit(6)
//                .forEach(System.out::println);
    }
}
