import java.io.Closeable;
import java.io.Serializable;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;
import java.util.Scanner;

public class C06Polymorphism {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 다양한 타입의 변수에 동일한 객체를 할당
        String s = "java";
        Serializable o = s;    // String은 Serializable을 구현
        CharSequence p = s;    // String은 CharSequence를 구현
        Comparable<String> q = s; // String은 Comparable<String>을 구현
        Constable r = s;       // String은 Constable을 구현
        ConstantDesc t = s;    // String은 ConstantDesc을 구현 (java.lang.constant 패키지)

        Scanner scanner2 = new Scanner("");
        Object v1 = scanner2;  // Scanner는 Object를 상속받음
        Closeable v2 = scanner2; // Scanner는 Closeable을 구현
        AutoCloseable v3 = scanner2; // Scanner는 AutoCloseable을 구현
    }
}