package ch03.lecture.p07_ex;

import java.util.Scanner;

public class ConditionalOperation_106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
        System.out.println(score + "점은 " + grade + "등급입니다.");
    }
}
