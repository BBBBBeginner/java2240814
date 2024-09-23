package ch18.lecture.p1io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C05OutputStream {
    public static void main(String[] args) {

        String name = "C:/Temp/output5.txt";

        try (OutputStream os = new FileOutputStream(name);) {
            os.write(55);// 3byte
            os.write(new byte[]{5, 3, 2});// 3byte
            os.write(new byte[]{6, 7, 8, 9, 10}); // 5 bytes 쓰기
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
