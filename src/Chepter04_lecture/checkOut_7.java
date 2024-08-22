package Chepter04_lecture;

import java.util.Scanner;

public class checkOut_7 {
    public static void main(String[] args) {
        //capter4_확인문제7

        Scanner sc = new Scanner(System.in);
        int balance = 0;
        int money = 0;
        double min = 0;
        boolean w = true;
        boolean w2 = true;


        while (w) {
            System.out.println("===============================");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("===============================");
            System.out.println("선택 >");
            int choice = sc.nextInt();
            System.out.println();
            switch (choice) {
                case 1 -> {
                    System.out.println("예금액 입력 >");
                    money = sc.nextInt();
                    balance += money;
                    System.out.println("예금액 :" + balance);

                }

                case 2 -> {
                    System.out.println("출금 금액 >");
                    min = sc.nextDouble();
                    balance -= (int) min;
                    System.out.println("출금액 :" + min);
                    if (balance < 0) {
                        System.out.println("잔액 부족");
                        System.out.println("초과 금액" + balance);
                        balance += min;
                        while (w2) {
                            System.out.println("금액 다시 입력(나가기 > '-1'입력) :");
                            min = sc.nextDouble();
                            balance -= min;
                            if (min == -1) {
                                balance -= 1;
                                w2 = false;
                            } else if (balance >= 0) {
                                w2 = false;
                            } else if (balance < 0) {
                                balance += min;
                            }
                        }
                    }
                    w2 = true;
                    System.out.println();
                    System.out.println("잔고 :" + balance);
                }

                case 3 -> {
                    System.out.println("잔고 :" + balance);
                }

                case 4 -> {
                    w = false;
                }
            }
        }
        System.out.println("프로그램 종료");
    }
}
