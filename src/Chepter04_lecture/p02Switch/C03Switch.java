package Chepter04_lecture.p02Switch;

public class C03Switch {
    public static void main(String[] args) {
        //1 ~ 6 정수
        int n = (int) (Math.random() * 6) + 1;

        // 현제 버전 switch 활용
        switch (n) {
            case 1, 3, 5 -> {
                System.out.println("홀수");
            }
            case 2, 4, 6 -> {
                System.out.println("짝수");
            }
        }


    }
}
