package Ch04_lecture.p05break;

public class C03Countinue {
    public static void main(String[] args) {
        // continue; 코드 블럭 내의 나머지 코드를 실행하지 않고 반복문 진행

        boolean a = true;
        for (int i = 0; i < 5; i++) {
            System.out.println("위 명령문");

            if (a) {
                continue;
            }// if 아래 명령문 실행하지 않고 if(continue) 기준 위의 코드만 반복
            System.out.println("아래 명령문");
        }

    }
}
