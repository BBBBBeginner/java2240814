package ch03.lecture.p01arithmetic;

public class Ch04Overflow {
    public static void main(String[] args) {
        //byte : -128 ~ 127

        //underflow
        byte a = 127; // 0111 1111
        a = (byte) (a + 1);
        System.out.println("a = " + a); // -128 = 1000 0000

        //overflow
        byte b = -128; //1000 0000
        b = (byte) (b - 1); // 1000 0000 - 0001 = 0111 1111
        System.out.println("b =" + b); // 127 = 0111 1111
    }
}
