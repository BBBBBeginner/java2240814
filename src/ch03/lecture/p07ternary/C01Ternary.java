package ch03.lecture.p07ternary;

import java.util.Scanner;

public class C01Ternary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 삼항연산자
        // a ? b : ch05_lecture.p01Array.a.c
        // 연산결과는 a가 true 이면 b,
        // a가 false 이면 ch05_lecture.p01Array.a.c

        int a = true ? 5 : 3;
        System.out.println("a =" + a);


        System.out.print("나이 입력");
        int age = scanner.nextInt();

        String message = (age >= 13 && age <= 19) ? "청소년" : "청소년 아님";

        System.out.println(message);


    }
}
