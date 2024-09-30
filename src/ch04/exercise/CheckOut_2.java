package ch04.exercise;

import java.util.Scanner;

public class CheckOut_2 {
    public static void main(String[] args) {
//   chapter4 확인문제 2.
        Scanner scanner = new Scanner(System.in);

        System.out.println("입력");
        String grade = scanner.next();

        System.out.println(switch (grade) {
            case "A" -> 100;
            case "B" -> {
                int result = 100 - 20;
                yield result;
            }
            default -> 60;
        });

    }
}

