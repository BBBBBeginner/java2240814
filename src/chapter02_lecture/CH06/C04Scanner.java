package chapter02_lecture.CH06;

import java.util.Scanner;

public class C04Scanner {
    public static void main(String[] args) {
        // 실수 두 개 입력 받아서 더한값 출력하기

        Scanner scanner = new Scanner(System.in);

        System.out.print("수1>");
        String n1 = scanner.nextLine();

        System.out.println("수2 >");
        String n2 = scanner.nextLine();

        float a1 = Float.parseFloat(n1);
        float a2 = Float.parseFloat(n2);

        double a3 = a1 + a2;
        System.out.println("두 값의 합 : " + a3);

    }
}
