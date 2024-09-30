package ch04.lecture.p02switch;

public class C07CurlyBracket {
    public static void main(String[] args) {
        // if , else ,else if , case
        // 의 코드 블럭이 한줄이면 {} 생략 가능
        if (true) {
            System.out.println(7);
            System.out.println(8);
        }
        //if 생략
        if (true)
            System.out.println(4);
        else if (true)
            System.out.println(5);
        else System.out.println(6);

        //switch 생략 
        int n = 2;

        switch (n) {
            case 1 -> {
                System.out.println(1);
                System.out.println(2);
            }
            case 2 -> System.out.println(3);
        }

    }
}
