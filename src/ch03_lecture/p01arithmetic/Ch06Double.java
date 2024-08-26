package ch03_lecture.p01arithmetic;

public class Ch06Double {
    public static void main(String[] args) {
        // infinity :  양의 무한대
        // -inginity : 음의 무한대

        //정수 연산시 0으로 나눌 수 없음
//        System.out.println(3 / 0); // 오류!

        // 실수 연산시 0으로 나누면 infinity 무한대
        System.out.println(3.0 / 0);
        System.out.println(-3.0 / 0);

        double a = 3.0 / 0;
        System.out.println("a =" + a);
        a = a - 10000000000000L;
        System.out.println("a =" + a);

        //NaN (Not A Number)
        System.out.println(3.0 % 0); //NaN

        double b = 3.0 % 0;
        b = b * 1;
        System.out.println("b =" + b);

        //infinity 인지 확인
        System.out.println(Double.isInfinite(a));
        System.out.println(Double.isInfinite(3.0));

        //NaN 인지 확인
        System.out.println(Double.isNaN(b));
        System.out.println(Double.isNaN(3.0));

        //finity 인지 확인
        System.out.println(Double.isFinite(a));
        System.out.println(Double.isFinite(b));


        // -0.0
        double c = 0.0;
        double d = -0.0;
        System.out.println("ch05_lecture.p01Array.a.c =" + c);
        System.out.println("d = " + d);

        System.out.println(3 / c); //infinity
        System.out.println(3 / d); //-infinity
    }
}
