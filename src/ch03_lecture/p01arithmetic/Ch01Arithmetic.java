package ch03_lecture.p01arithmetic;

public class Ch01Arithmetic {
    public static void main(String[] args) {
        //산술 연산자
        // +. -.*, /, %

        System.out.println(3 + 5);
        System.out.println(5 - 2);
        System.out.println(5 * 4);
        System.out.println(8 / 2);

        // 3.5(x), 3(o), integer끼리 연산결과는 integer
        System.out.println(7 / 2);

        // % : 나머지 연산(remainder, modulus) : 나머지 값만 표시
        System.out.println(7 % 2); //1
        System.out.println(8 % 3); //2

        int a = 10;
        int b = 3;

        System.out.println(a % b);

        int c = a * b;
        System.out.println("c = " + c);


    }
}
