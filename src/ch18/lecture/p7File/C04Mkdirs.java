package ch18.lecture.p7File;

import java.io.File;

public class C04Mkdirs {
    public static void main(String[] args) {
        // mkdirs 여러 폴더 한 번에 만들기
        String path = "C:/Temp/fold1/fold2/fold3/fold4/fold5";
        File f1 = new File(path);
        boolean exists = f1.exists();

        System.out.println("exists = " + exists);

        // 폴더가 존재하지 않으면 생성
        if (!exists) {
            f1.mkdirs(); // 여러 단계의 폴더 생성
            System.out.println("디렉토리 생성됨");
        }
    }
}