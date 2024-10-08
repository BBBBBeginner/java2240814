package ch08.sec07;

public class ServiceExample {
    public static void main(String[] args) {
        // ServiceImpl 클래스의 인스턴스를 생성
        Service service = new ServiceImpl();

        // 디폴트 메서드 호출
        service.defaultMethod1();
        System.out.println();

        // 정적 메서드 호출 (정적 메서드는 인터페이스 이름을 통해 호출)
        Service.staticMethod1();
        System.out.println();
        Service.staticMethod2();
        System.out.println();
    }
}