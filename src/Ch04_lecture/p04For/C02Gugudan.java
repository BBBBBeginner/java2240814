package Ch04_lecture.p04For;

public class C02Gugudan {
    public static void main(String[] args) {
        //for , while 로 구구단 2단출력

        for (int dan = 1; dan < 10; dan++) {
            for (int i = 1; i < 10; i++) {
                System.out.println(dan + "x" + i + "=" + (dan * i));
            }
        }

    }
}

