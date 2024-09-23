package ch18.example.num10;

import java.io.*;

public class Example {
    public static void main(String[] args) throws IOException {


        String original = "C:/Temp/강아지1.jfif";
        String target = "C:/Temp/강쥐.jpg";

        if (original == null) {
            System.out.println("원본 파일이 존재하지 않습니다.");
        }
        try (InputStream is = new FileInputStream(original);
             OutputStream os = new FileOutputStream(target);) {

            byte[] data = new byte[100]; // 읽은 바이트(데이터) 저장
            int len = 0; // 읽은 바이트 수 저장

            while ((len = is.read(data)) != -1) {
                os.write(data, 0, len);
            }

            System.out.println("복사가 성공되었습니다.");
        }
    }
}
