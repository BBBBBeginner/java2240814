package ch02_lecture.CH06;

import java.util.Scanner;

public class C07Scanner {
    public static void main(String[] args) {
        // nextDouble 사용
        Scanner scanner = new Scanner(System.in);
        System.out.println("두 수를 한 줄에 띄워서 입력 > ");
        double n1 = scanner.nextDouble(); // nextDouble
        double n2 = scanner.nextDouble();

//        int v1 = Integer.parseInt(n1);
//        int v2 = Integer.parseInt(n2);

        System.out.println("더한 값 =" + (n1 + n2));

    }
}
