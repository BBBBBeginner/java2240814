package ch18.lecture.p7File;

import java.io.File;

public class C03Mkdir {
    public static void main(String[] args) {
        // mkdir, mkdirs
        // : 디렉토리 만들기

        String path1 = "C:/Temp/fold1";
        File f1 = new File(path1);
        boolean exists = f1.exists();
        System.out.println("exists = " + exists);

        if (!exists) {
            boolean isCreated = f1.mkdir(); // 디렉토리 생성
            System.out.println("mkdir = " + isCreated); // 생성 성공 여부 출력
        }
    }
}