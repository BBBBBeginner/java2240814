package ch19.lecture.p1network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class C04Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("172.30.1.84", 9999); // 소켓을 통해 서버에 연결
        OutputStream os = socket.getOutputStream(); // 소켓으로부터 출력 스트림 얻기
        BufferedOutputStream bos = new BufferedOutputStream(os);

        String fileName = "C:/Temp/웃는아기.jpg";
        FileInputStream fis = new FileInputStream(fileName);
        BufferedInputStream bis = new BufferedInputStream(fis);


        try (bis; fis; bos; os; socket;) {
            byte[] data = new byte[1000];

            int length = 0;
            while ((length = bis.read(data)) != -1) {
                bos.write(data, 0, length);
            }
            bos.flush();

            System.out.println("보내기 완료");
        }
    }
}
