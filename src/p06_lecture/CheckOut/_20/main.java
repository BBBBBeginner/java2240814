package p06_lecture.CheckOut._20;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        int choice = 0;
        boolean bool = true;


        System.out.println("""
                -------------------------------------
                1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료
                -------------------------------------
                
                """);
        while (bool) {
            System.out.println("선택 >");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("""
                            -------
                            계좌생성
                            -------
                            """);
                    System.out.println("계좌변호 : ");
                    scanner.next();

                }


            }


        }


    }
}
