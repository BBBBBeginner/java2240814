package ch12.lecture.p04regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class C06Exercise {
    public static void main(String[] args) {
        // 사용자 입력을 받아서
        // 전화번호 패턴과 같은 지 확인
        // 010-9999-1111
        // 02-2345-6788
        // 031-789-7890

        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();

        if (Pattern.matches("\\d{3}-\\d{4}-\\d{4}", num)) {
            System.out.println("핸드폰");
        } else if (Pattern.matches("\\d{2}-\\d{4}-\\d{4}", num)) {
            System.out.println("집 전화번호");
        } else if (Pattern.matches("\\d{3}-\\d{3}-\\d{4}", num)) {
            System.out.println("모르는 번호");
        } else {
            System.out.println("유효하지 않은 번호");
        }
    }
}