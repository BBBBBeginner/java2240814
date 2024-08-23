package ch02_lecture.CH4.p04conversion;

public class C04TypeConversion {
    public static void main(String[] args) {

        char a = '한';
        int b = a;
        System.out.println("a =" + a);
        System.out.println("b =" + b);

        long c = b;
        System.out.println("c" + c);

        a = (char) b;// 자동형변환 x, 강제형변환
        System.out.println("a" + a);
    }
}
