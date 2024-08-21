package Chepter04_lecture.p01_ex;

import java.util.Scanner;

public class IfElse2_ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("나이 입력:");
        int age = scanner.nextInt();

        if (age >= 20) {
            System.out.println("성인입니다.");
        } else if (age >= 13 && age <= 19) {
            System.out.println("청소년입니다.");

        } else if (age >= 6 && age <= 12) {
            System.out.println("어린이입니다.");

        } else if (age >= 1 && age < 5) {
            System.out.println("유아입니다.");
        } else {
            System.out.println("잘못 입력하였습니다.");
        }
    }

}
