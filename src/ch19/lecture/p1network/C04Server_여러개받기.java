package ch19.lecture.p1network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

public class C04Server_여러개받기 {
    public static void main(String[] args) throws Exception {
        // 클라이언트가 보낸 파일을 받기 위한 서버
        AtomicInteger number = new AtomicInteger(0); // 파일 번호를 추적하기 위한 AtomicInteger
        ServerSocket serverSocket = new ServerSocket(9999); // 서버 소켓 생성

        while (true) {
            // 클라이언트의 연결을 기다림
            Socket socket = serverSocket.accept();

            // 새로운 스레드 생성하여 클라이언트의 파일 전송을 처리
            Thread t = new Thread(() -> {
                try {
                    InputStream is = socket.getInputStream(); // 입력 스트림
                    BufferedInputStream bis = new BufferedInputStream(is); // 버퍼링된 입력 스트림

                    int n = number.incrementAndGet(); // 파일 번호 증가
                    String name = "C:/Temp/file" + n + ".jpg"; // 파일 이름 생성
                    FileOutputStream os = new FileOutputStream(name); // 파일 출력 스트림
                    BufferedOutputStream bos = new BufferedOutputStream(os); // 버퍼링된 출력 스트림

                    try (bos; os; bis; is; socket;) {
                        byte[] data = new byte[1000]; // 1000바이트 크기의 배열 생성
                        int length; // 읽은 데이터의 길이

                        // 클라이언트로부터 파일 데이터를 읽어와서 저장
                        while ((length = bis.read(data)) != -1) {
                            bos.write(data, 0, length); // 읽은 데이터 파일에 쓰기
                        }
                        bos.flush(); // 버퍼의 내용을 강제로 출력
                        System.out.println("파일 받기 완료"); // 수신 완료 메시지
                    }
                } catch (Exception e) {
                    e.printStackTrace(); // 예외 발생 시 스택 트레이스 출력
                }
            });

            t.start(); // 스레드 시작
        }
    }
}