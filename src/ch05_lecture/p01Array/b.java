package ch05_lecture.p01Array;

import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("학생수 :");
        int stu = scanner.nextInt();

        int sum = 0;
        int evg = 0;
        int[] a = new int[stu];
        int[] b = new int[stu];


        for (int i = 0; i < a.length; i++) {
            System.out.println("\n" + i + ")학생 점수 : ");
            b[i] = scanner.nextInt();
        }
        for (int n = 0; n < b.length; n++) {
            sum += b[n];
        }
        System.out.println("\n총 점수 :");
        System.out.println(sum);

        evg = sum / stu;
        System.out.println("\n평균점수");
        System.out.println(evg);

    }
}
