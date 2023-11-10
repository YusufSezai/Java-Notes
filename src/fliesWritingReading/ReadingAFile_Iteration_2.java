package fliesWritingReading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingAFile_Iteration_2 {
    public static void main(String[] args) {
        String path = "C:/Users/PC/Desktop/deneme.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }
            reader.close();
        } catch (IOException e) {

        }
    }
}
