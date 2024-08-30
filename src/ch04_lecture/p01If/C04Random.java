package ch04_lecture.p01If;

public class C04Random {
    public static void main(String[] args) {
        //임의의 수 리턴
        // 0 <= 실수(double) < 1
        double n = Math.random(); // (double)0 ~ 0.999999
        System.out.println("n = " + n);


        // 목표 1,2,3

        // 0 * 3 <= (n * 3) < 3
        // 0 <= (n * 3) < 3
        // 0 <= (int) (n * 3) <= 2 (단 정수)
        // 0 + 1 <= (int) (n*3) + 1 < 2 +1
        // 1 <= (int) (n*3) + 1 <= 3 (단 정수)
        System.out.println((int) ((n * 3) + 1));
    }
}
