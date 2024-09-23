package ch18.lecture.p1io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C06OutputStream {
    public static void main(String[] args) {
        String name = "C:/Temp/output6.txt";

        try (OutputStream os = new FileOutputStream(name)) {
            byte[] arr = {4, 5, 6, 7, 8, 9, 10};

            os.write(5);
            os.write(new byte[]{1, 2, 3});
            os.write(arr, 0, 5); //45678
            os.write(arr, 3, 3); //789
            os.write(arr, 5, 1); //9
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
