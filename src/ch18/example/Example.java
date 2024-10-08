package ch18.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example {
    public static void main(String[] args) throws IOException {
        String path = "src/ch18/exercise/p7/Example.java";

        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);

        int rowNumber = 0;
        String rowData;
        while (true) {
            rowData = br.readLine();
            if (rowData == null) {
                break;
            }
            System.out.println(+rowNumber + ":" + rowData);
        }
    }
}
