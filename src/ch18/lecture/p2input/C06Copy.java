package ch18.lecture.p2input;

import java.io.*;

public class C06Copy {
    public static void main(String[] args) {
        String origin = "C:/Temp/강아지1.jfif";
        String target = "C:/Temp/지구온난화.jpg";

        try {
            InputStream is = new FileInputStream(origin);
            OutputStream os = new FileOutputStream(target);

            is.transferTo(os);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
