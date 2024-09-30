package ch04.lecture.p04for;

public class C03Gugudan {
    public static void main(String[] args) {
// 9~2단까지 거꾸로 출력
        for (int dan = 9; dan >= 2; dan--) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(STR."\{dan}*\{i} = \{dan * i}");
            }
        }
    }
}
