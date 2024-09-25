package ch12.sec12;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
    public static void main(String[] args) throws Exception {
        Method[] declaredMethods = Service.class.getDeclaredMethods();

        // 메서드마다 어노테이션을 확인하고 처리
        for (Method method : declaredMethods) {
            // PrintAnnotation 얻기
            PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

            printLine(printAnnotation); // 어노테이션 속성 값에 맞춰 출력 라인 생성
            method.invoke(new Service()); // 메서드 실행
            printLine(printAnnotation); // 어노테이션 속성 값에 맞춰 출력 라인 생성
        }
    }

    // 어노테이션 정보로 출력하는 메서드
    public static void printLine(PrintAnnotation printAnnotation) {
        if (printAnnotation != null) {
            // number 속성값 얻기
            int number = printAnnotation.number();
            for (int i = 0; i < number; i++) {
                // value 속성값 얻기
                String value = printAnnotation.value();
                System.out.print(value); // 출력 문자 이어서 출력
            }
            System.out.println(); // 줄바꿈
        }
    }
}