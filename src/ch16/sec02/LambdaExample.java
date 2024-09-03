package ch16.sec02;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        // 람다 표현식이 여러 줄인 경우 중괄호 필요
        person.action(() -> {
            System.out.println("출근을 합니다.");
            System.out.println("프로그래밍을 합니다.");
        });

        // 람다 표현식이 한 줄인 경우 중괄호 생략 가능
        person.action(() -> System.out.println("퇴근합니다."));
    }
}