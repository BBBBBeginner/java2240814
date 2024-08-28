package p06_lecture.lecture.p07Package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class C06Package {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        FileInputStream f = new FileInputStream("dfg");
        FileOutputStream o = new FileOutputStream("dfg");

        // 파일 입출력 작업 수행
    }
}