package ch04_lecture.p01_ex;

import java.util.Scanner;

public class IfElseIfElse_ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("점수가 100~90");
            System.out.println("등급은 A");
        } else if (score >= 80) {
            System.out.println("점수가 80 ~90입니다.");
            System.out.println("등급은 B");

        } else if (score >= 70) {
            System.out.println("점수가 70~79입니다.");
            System.out.println("등급은 C");

        } else {
            System.out.println("점수가 70 미만입니다.");
            System.out.println("등급은 D");
        }
    }
}
