package chapter02_lecture.CH2;

import java.math.BigDecimal;

public class C03Double {
    public static void main(String[] args) {
        double a = 0.1; //0.1의 근사값
        double b = 0.2; //0.2의 근사값
        double c = a + b; // = 0.30000000000000000000000004 나옴

        System.out.println("c =" + c);

        BigDecimal d = new BigDecimal("0.1");
        BigDecimal e = new BigDecimal("0.2");
        BigDecimal f = d.add(e);
        System.out.println("f = " + f);
    }
}
