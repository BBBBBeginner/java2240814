package chapter02_lecture.CH3.P03;

public class C05Passing {
    public static void main(String[] args) {
        String a = "33";
//        문자열을 intㄹ 변환 (파싱)
        int a1 = Integer.parseInt(a);

        Integer b = 2 * a1; //66
        System.out.println("b = " + b);

        String c = "3.14";

        // 문자열을 double로 parsing
        double c1 = Double.parseDouble(c);

        double d = 5 + c1; // 8,14
        System.out.println("d =" + d);
    }
}
