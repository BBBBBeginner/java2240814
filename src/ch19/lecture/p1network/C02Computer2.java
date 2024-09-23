package ch19.lecture.p1network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class C02Computer2 {
    public static void main(String[] args) throws Exception {
        // 서버에 연결 (IP 주소와 포트 지정)
        Socket socket = new Socket("172.30.1.83", 9999); //"172.30.1.84"

        // 입력 스트림 준비
        InputStream is = socket.getInputStream(); // 소켓으로부터 입력 스트림 얻기
        InputStreamReader isr = new InputStreamReader(is); // 바이트 스트림을 문자 스트림으로 변환
        BufferedReader br = new BufferedReader(isr); // 버퍼를 사용하여 효율적으로 입력

        // try-with-resources를 사용하여 자동으로 리소스를 닫음
        try (br; isr; is; socket) {
            // 서버로부터 메시지를 읽음
            String line = br.readLine(); // 한 줄 읽기
            System.out.println("line = " + line); // 읽은 메시지 출력
        }
    }
}
//BufferedReader의 readLine() 메서드를 호출하여 한 줄의 텍스트를 읽어오고, 그 결과를 저장