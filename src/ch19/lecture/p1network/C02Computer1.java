package ch19.lecture.p1network;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class C02Computer1 {
    public static void main(String[] args) throws Exception {
        // 포트 9999에서 서버 소켓 생성
        ServerSocket serverSocket = new ServerSocket(9999); // 9999 포트 번호

        // 클라이언트의 연결을 기다림
        Socket socket = serverSocket.accept();

        // 출력 스트림 준비
        OutputStream os = socket.getOutputStream(); // 소켓으로부터 출력 스트림 얻기
        OutputStreamWriter osw = new OutputStreamWriter(os); // 바이트 스트림을 문자 스트림으로 변환
        BufferedWriter bw = new BufferedWriter(osw); // 버퍼를 사용하여 효율적으로 출력

        // try-with-resources를 사용하여 자동으로 리소스를 닫음
        try (bw; osw; os; socket; serverSocket) {
            // 클라이언트에게 메시지를 전송
            bw.write("반갑습니다. 클라이언트"); // 메시지 작성
            bw.newLine(); // 메시지 종료를 위한 줄바꿈
            bw.flush(); // 버퍼의 내용을 강제로 출력
        }
    }
}