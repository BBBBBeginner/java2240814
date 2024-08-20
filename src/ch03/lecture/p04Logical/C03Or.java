package ch03.lecture.p04Logical;

import java.util.Scanner;

public class C03Or {
    public static void main(String[] args) {
        //2의 배수 또는 5의 배수
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        int num = age;

        boolean result = (num % 2 == 0) || (num % 5 == 0);
        if (result) {
            System.out.println("2 또는 5의 배수");
        } else {
            System.out.println("2 또는 5의 배수 아님");
        }
    }
}
