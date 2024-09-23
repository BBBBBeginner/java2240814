package ch18.sec07;

import java.io.*;

public class BufferExample {
    public static void main(String[] args) throws Exception {
        // 803쪽
        // 책 8~9 줄
        String originalFilePath1 = "C:/Temp/지구온난화.jpg";
        String targetFilePath1 = "C:/Temp/targetFile1.jpg";

        FileInputStream fis = new FileInputStream(originalFilePath1);
        FileOutputStream fos = new FileOutputStream(targetFilePath1);

        try (fos; fis) {
            long time1 = copy(fis, fos);
            System.out.println("time1 = " + time1);
        }

        // 책 15~16 줄
        String originalFilePath2 = "C:/Temp/지구온난화.jpg";
        String targetFilePath2 = "C:/Temp/targetFile2.jpg";
        FileInputStream fis2 = new FileInputStream(originalFilePath2);
        FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
        BufferedInputStream bis = new BufferedInputStream(fis2);
        BufferedOutputStream bos = new BufferedOutputStream(fos2);

        try (bos; bis; fos2; fis2) {
            long time2 = copy(bis, bos);
            System.out.println("time2 = " + time2);
        }


    }

    private static long copy(InputStream is, OutputStream os) throws IOException {

        long start = System.nanoTime();
        while (true) {
            int data = is.read();

            if (data == -1) {
                break;
            }
            os.write(data);

        }
        os.flush();
        long end = System.nanoTime();

        return (end - start);

    }
}