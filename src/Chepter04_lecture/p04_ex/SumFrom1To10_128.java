package Chepter04_lecture.p04_ex;

public class SumFrom1To10_128 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        for (; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1~" + (i - 1) + "합 :\n" + sum);

    }
}
