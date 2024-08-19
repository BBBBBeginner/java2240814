package chapter02_lecture.CH3.P03;

public class C03Print {
    public static void main(String[] args) {
        System.out.printf("형식 문자열 %s%n", "이름 등등");
        System.out.printf("형식 문자열 여러 개  %s,%s%n", "첫번째", "두번째");
//        %10s : 10개의 공간을 차지하고 포메팅
        System.out.printf("형식 %10s%10s%n", "abc", "def");
//        %-10s : 10개의 공간을 왼쪽정렬로 차지하고 포메팅
        System.out.printf("형식 %-10s%-10s%n", "abc", "def");

//        %d : 정수(byte, short , int , long) 출력
        System.out.printf("정수 %d,%d%n", 345, 678);
        System.out.printf("정수 %10d, %10d%n", 345, 789);
        System.out.printf("정수 %-10d, %-10d%n", 345, 789);
        System.out.printf("정수 %010d, %010d%n", 345, 789);

//        %f : 실수(float, double) 출력
        System.out.printf("실수 %f,%f%n", 3.14, 9.1234);
        System.out.printf("실수 %10f,%10f%n", 3.14, 9.1234);
        System.out.printf("실수 %-10f,%-10f%n", 3.14, 9.1234);
        System.out.printf("실수 %010f,%010f%n", 3.14, 9.1234);
        System.out.printf("실수 %010.1f,%010.3f%n", 3.14, 9.1234);


    }
}
