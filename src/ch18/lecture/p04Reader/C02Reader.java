package ch18.lecture.p04Reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class C02Reader {
    public static void main(String[] args) {
        String name = "C:/Temp/output33.txt";


        try {
            Reader reader = new FileReader(name);
            char[] data = new char[5];
            System.out.println(Arrays.toString(data));

            reader.read(data);
            System.out.println(Arrays.toString(data));

            reader.read(data);
            System.out.println(Arrays.toString(data));

            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
