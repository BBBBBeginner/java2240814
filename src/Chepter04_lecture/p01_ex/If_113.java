package Chepter04_lecture.p01_ex;

import java.util.Scanner;

public class If_113 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double score = scanner.nextDouble();

        if (score >= 90) {
            System.out.println("점수가 90 보다 큽니다.");
            System.out.println("등급은 A입니다.");
        }
        if (score < 90) {
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B입니다.");
        }
    }
}
