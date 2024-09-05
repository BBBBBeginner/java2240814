package ch12.lecture.p04regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class C02Exercise {
    public static void main(String[] args) {
        // 사용자 입력 받아서
        // 6 개의 숫자로 이루어진 문자열인지 확인하는 코드

        Scanner scanner = new Scanner(System.in);
        String Num = scanner.nextLine();

        String a = "[0-9][0-9][0-9][0-9][0-9][0-9]";
        System.out.println(Pattern.matches(a, Num));
    }
}
