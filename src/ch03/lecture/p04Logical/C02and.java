package ch03.lecture.p04Logical;

import java.util.Scanner;

public class C02and {
    public static void main(String[] args) {
        // 13 ~ 19 : 청소년
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        boolean teenage = age >= 13 && age <= 19;
        if (teenage) {
            System.out.println("청소년입니다.");
        } else {
            System.out.println("청소년이 아닙니다.");
        }
    }
}
