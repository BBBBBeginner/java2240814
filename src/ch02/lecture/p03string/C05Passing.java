package ch02.lecture.p03string;

public class C05Passing {
    public static void main(String[] args) {
//        문자열 변환 (parsing)
        String a = "33";
//        문자열을 int로 변환 (.parse)
        int a1 = Integer.parseInt(a);

        int b = 2 * a1; //66
        System.out.println("b = " + b);


        // 문자열을 double로 parsing
        String c = "3.14";

        double c1 = Double.parseDouble(c);

        double d = 5 + c1; // 8,14
        System.out.println("d =" + d);
    }
}
