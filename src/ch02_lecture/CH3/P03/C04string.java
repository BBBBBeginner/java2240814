package ch02_lecture.CH3.P03;

public class C04string {
    public static void main(String[] args) {
        //결합연산

        String b = "10";
        String a = "40";

        String c = b + a;

        System.out.println("ch05_lecture.p01Array.a.c =" + c);

        String d = "3";
        String f = d + c;
        System.out.println("f =" + f);

        String g = "흥민";
        String h = "토트넘";
        String i = g + "의 팀은 " + h + "입니다.";
        System.out.println("i =" + i);

        // 다른 타입과 + (연결) 연산 시 결과는 String
        String j = "3" + 5;
        String k = 5 + "3";
        String l = 5 + 3 + "0";
        System.out.println("j =" + j);
        System.out.println("k =" + k);
        System.out.println("l =" + l);
    }
}
