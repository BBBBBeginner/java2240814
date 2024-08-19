package chapter02_lecture.CH06;

import java.util.Scanner;

public class C01Scanner {
    public static void main(String[] args) {
        // Scanner : 소스를 훑으며 입력받음
        Scanner scanner = new Scanner(System.in);

        System.out.println("입력 >>");
        String str = scanner.nextLine(); // 한 줄 입력받음

        System.out.println("출력 >>");
        System.out.println("str =" + str);
    }
}
