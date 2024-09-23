package ch19.lecture.p1network;

import java.io.InputStream;
import java.net.Socket;

public class C01Computer2 {
    public static void main(String[] args) throws Exception {
//보내는것


        // client


        // Socket
        Socket socket = new Socket("172.30.1.84", 9999);
        InputStream is = socket.getInputStream();
        try (is; socket) {

            int data = is.read();

            System.out.println((char) data);
        }
    }
}
