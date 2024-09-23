package ch18.lecture.p3Writer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C01Writer {
    public static void main(String[] args) {
        String name = "C:/Temp/output1.txt";

        try {
            OutputStream os = new FileOutputStream(name);
            os.write(65); // 1byte 쓰기 A
            os.write(66);
            os.write('c');

            // 1byte 쓰기 B / 아스키코드 활용하여 한글로
            os.write(235);
            os.write(149);
            os.write(136);

            os.write('안');
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
// 바이트 입출력으로 쓰려니 너무 불편 -> 그래서 나온게 문자 입출력 Reader, Writer
    }
}
