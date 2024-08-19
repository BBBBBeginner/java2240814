package chapter02_lecture.CH06;

import java.util.Scanner;

public class C03Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("수1>");
        String num1 = scanner.nextLine();

        System.out.println("수2 >");
        String num2 = scanner.nextLine();

        System.out.println("더한 결과 :" + (num1 + num2));
//        System.out.println("더한 결과 :" + (n1 + n2));


    }
}
