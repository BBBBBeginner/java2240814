package ch18.lecture.p7File;

import java.io.File;

public class C01File {
    public static void main(String[] args) {
        // File : 파일 객체
        String path = "src/ch18/lecture/p7file/C01File.java";
        File f1 = new File(path);

        long length = f1.length();
        boolean exists = f1.exists();
        boolean directory = f1.isDirectory();
        String absolutePath = f1.getAbsolutePath();

        System.out.println("length = " + length);
        System.out.println("exists = " + exists);
        System.out.println("eirectory = " + directory);
        System.out.println("absolutePath = " + absolutePath);
    }
}
