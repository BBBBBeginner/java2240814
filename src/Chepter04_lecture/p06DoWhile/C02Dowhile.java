package Chepter04_lecture.p06DoWhile;

import java.util.Scanner;

public class C02Dowhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("message :");
        System.out.println("프로그램을 종료하며면 q를 입력");

        String inputString;

        do {
            System.out.println(">");
            inputString = scanner.nextLine();
            System.out.println(inputString);
        } while (!inputString.equals("q"))
                ;

        System.out.println();
        System.out.println("프로그램 종료");
    }
}
