package ch05.lecture.p02reference;

import java.util.Arrays;

public class C07ArrayCopy {
    public static void main(String[] args) {
        int[] a = {6, 7, 8};
        int[] b = new int[]{6, 7, 8};

        for (int i = 0; i < a.length; i++) {

        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        b[0] = 99;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
