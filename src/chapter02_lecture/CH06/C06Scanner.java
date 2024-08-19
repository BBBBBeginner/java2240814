package chapter02_lecture.CH06;

import java.util.Scanner;

public class C06Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("두 수를 한 줄에 띄워서 입력 > ");
        String n1 = scanner.next();
        String n2 = scanner.next();

        int v1 = Integer.parseInt(n1); // nextDouble
        int v2 = Integer.parseInt(n2);

        System.out.println("더한 값 =" + (v1 + v2));

    }
}
