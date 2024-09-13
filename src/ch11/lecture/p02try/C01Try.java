package ch11.lecture.p02try;

public class C01Try {
    public static void main(String[] args) {
        try {
            //exeption이 발생할것 같은 코드들
            int a = 3;
            int b = 0;
            int c = a / b; //ArithemethicException
        } catch (ArithmeticException e) {
            //exeption 객체로 어떤 일을 함..

        }

        System.out.println("다음코드");
    }
}
