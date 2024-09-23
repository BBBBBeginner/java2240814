package ch18.lecture.p1io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
//OutputStream은 추상 클래스로, 모든 출력 스트림 클래스의 부모 클래스입니다.
// FileOutputStream은 이 클래스를 상속받아 특정 구현을 제공하는 클래스입니다.

// OutputStream 클래스 자체는 데이터 출력을 정의하는 기본 동작을 포함하고 있으며,
// 실제로 사용하기 위해서는 서브클래스에서 이를 구현해야 합니다.


public class C02OutputStream {
    public static void main(String[] args) throws IOException {

        String name = "C:/Temp/output2.txt";
        OutputStream os = new FileOutputStream(name);

        // int : 4byte -21억 ~21억
        // byte : 1byte (-128 ~ 128)
        os.write(-128);
        os.write(210000000);
    }
}



