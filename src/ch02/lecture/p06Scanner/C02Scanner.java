package ch02.lecture.p06Scanner;

import java.util.Scanner;

public class C02Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("이름");
        String name = scanner.nextLine();

        System.out.println("나이 >");
        String age = scanner.nextLine(); // 입력은 스트링으로 밖에 못받음....
        // 다른걸로 받으려면 passing 사용해야함.

        String desc = STR."\{name}님의 나이는 \{age}입니다.";
        System.out.println(desc);
    }
}
