package chapter02_lecture.CH4.p04conversion;

public class C02TypeConversion {
    public static void main(String[] args) {
        // 실수 간
        // float(4), double(8)
        float a = 3.14F;
        double b = a;
        double c = 3.14;
        float d = (float) c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
