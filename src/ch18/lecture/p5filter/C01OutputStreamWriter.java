package ch18.lecture.p5filter;

import java.io.*;

public class C01OutputStreamWriter {
    public static void main(String[] args) throws IOException {
        String name = "C:/Temp/output51.txt";

        //바이트, 문자 입출력 스트림 결합해서 쓰는법
        OutputStream os = new FileOutputStream(name); // 바이트 입출력
        os.write(0xEC);
        os.write(0x95);
        os.write(0x88);

        Writer writer = new OutputStreamWriter(os); // 문자 입출력
        writer.write("녕");

        writer.close();
        os.close();
    }
}
