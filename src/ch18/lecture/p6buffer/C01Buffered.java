package ch18.lecture.p6buffer;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C01Buffered {
    public static void main(String[] args) throws IOException {
        String name = "C:/Temp/output61.txt";  // 경로 수정
        OutputStream os = new BufferedOutputStream(new FileOutputStream(name)); // 버퍼링 추가

        byte[] data = new byte[100];

        // 10,000번 파일에 데이터 쓰기
        for (int i = 0; i < 10000; i++) {
            os.write(data);
        }

        // 성능 측정 시작
        long start = System.nanoTime();

        // 다시 데이터 쓰기
        for (int i = 0; i < 10000; i++) {
            os.write(data);
        }

        // 성능 측정 끝
        long end = System.nanoTime();

        long time = end - start;
        System.out.println("time = " + time + " nanoseconds");

        os.close();  // 스트림 닫기
    }
}