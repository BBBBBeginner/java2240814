package ch11.lecture.p04checked;

public class C01UnChedkedException {
    public static void main(String[] args) {
//        UnChedkedExceptione (runtime exception, 실행 예외)
        // : RuntimeException 을 상속받은 클래스들의 객체
        // 컴파일러가 체크하지 않음
        // 실행 중 예외 발생
        try {
            Integer.parseInt("30");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        Integer.parseInt("abcd");


//    checked exeption
        // : RuntimeException을 상속받지 않은 클래스들의 객체
        //  컴파일러가 예외 처리 코드를 작성했는지 체크함


    }
}
