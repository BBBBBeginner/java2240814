package ch12.lecture.p03Math;

// static import

import static java.lang.Math.PI;
import static java.util.Arrays.copyOf;

public class C02SraricMember {
    public static void main(String[] args) {
        double p = PI; // static field;
//        System.out.println(p);
        int m = Math.max(300, 500); // static method;

        int[] a = {5, 9, 1};
        int[] b = copyOf(a, a.length);

    }
}
