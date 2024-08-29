package ch06.CheckOut.Person_ex;

public class main {
    public static void main(String[] args) {
        // Person 객체 생성
        Person person = new Person();

        // Setter 메서드를 사용하여 속성 설정
        person.setName("Alice");
        person.setAge(30);

        // Getter 메서드를 사용하여 속성 값 가져오기
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // 나이 유효성 검사를 통한 예외 처리
        person.setAge(-5);  // 유효하지 않은 나이 값 설정 시 메시지 출력
    }
}
