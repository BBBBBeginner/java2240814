package ch12.lecture.p04regex;

import static java.util.regex.Pattern.matches;

public class C03RegEx {
    public static void main(String[] args) {
        // 이미 정의된 클래스
        // \d : [0-9]
        // \w : [a-zA-z_0-9]
        // \s : 공백문자

        // 이스케이프 문자(특별한 의미를 지닌것을 표시) : 역슬래스는 \\ 로 표현

        String p1 = "\\d\\d\\d";
        System.out.println(matches(p1, "123"));
        System.out.println(matches(p1, "22"));
        System.out.println(matches(p1, "6789"));
        System.out.println(matches(p1, "679"));

        String p2 = "\\d\\s\\d";
        System.out.println(matches(p2, "9 1"));
        System.out.println(matches(p2, "999"));

        String p3 = "\\w\\w\\w";
        System.out.println(matches(p3, "_9a"));
        System.out.println(matches(p3, "abc"));
        System.out.println(matches(p3, "012"));

        //한글
        String p4 = "[가-힣][가-힣]";
        System.out.println(matches(p4, "흥민"));
        System.out.println(matches(p4, "홀란드"));
        System.out.println(matches(p4, "흥민"));
        System.out.println(matches(p4, "흥민"));

        String p5 = "\\p{IsHangul}";
        System.out.println(matches(p5, "가"));
        System.out.println(matches(p5, "손"));
        System.out.println(matches(p5, "흥민"));
        System.out.println(matches(p5, "a"));
        System.out.println(matches(p5, "0"));

    }
}
