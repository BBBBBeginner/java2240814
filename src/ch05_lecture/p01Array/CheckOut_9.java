package ch05_lecture.p01Array;

import java.util.Arrays;
import java.util.Scanner;

public class CheckOut_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean w = true;
        int Stu = 0;
        int Score = 0;
        int Choice = 0;

        int[] all = new int[Stu];
        System.out.println(all);
        System.out.println("""
                --------------------------------------------------
                1.학생수 | 2. 점수입력| 3.점수리스트 | 4. 분석| 5. 종료
                --------------------------------------------------
                """);

        while (w) {

            System.out.println("선택 > ");
            Choice = scanner.nextInt();

            switch (Choice) {
                case 1 -> {
                    System.out.println("학생수를 입력하시요 : ");
                    Stu = scanner.nextInt();
                    System.out.println(Arrays.toString(all));
                }
                case 2 -> {
                    System.out.println("각 학생의 점수를 입력하시요 : ");
                    for (int i = 0; i < all.length; i++) {
                        System.out.println("scores[" + all[i] + "] > ");

                    }

                }
            }

        }
    }
}

