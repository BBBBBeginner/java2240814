package ch18.lecture.sec11;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) throws Exception {
        //File 객체 생성
        File dir = new File("C:Temp/images");
        File file1 = new File("C:/Temp/file1.txt");
        File file2 = new File("C:/Temp/file2.txt");
        File file3 = new File("C:/Temp/file3.txt");

        if (dir.exists() == false) {
            dir.mkdirs();
        }
        if (file1.exists() == false) {
            file1.createNewFile();
        }
        if (file2.exists() == false) {
            file2.createNewFile();
        }
        if (file3.exists() == false) {
            file3.createNewFile();
        }


        File temp = new File("C:/Temp");
        File[] contents = temp.listFiles();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");

        for (File file : contents) {
            // 날짜와 시간을 출력
            System.out.printf("%-25s", sdf.format(new Date(file.lastModified())));

            // 디렉토리인지 파일인지 구분하여 출력
            if (file.isDirectory()) {
                System.out.printf("%-10s%-20s", "<DIR>", file.getName());
            } else {
                System.out.printf("%-10s%-20s", file.length(), file.getName());
            }
            System.out.println();
        }
    }
}