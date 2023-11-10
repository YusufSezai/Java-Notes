package fliesWritingReading.studentFolder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SkipMethod {
    public static void main(String[] args) {
        String path = "C:/Users/PC/Desktop/deneme.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            reader.skip(30); // skips first 30 chars of the line
            System.out.println(reader.readLine()); // prints the rest of the line
            reader.close();
        } catch (IOException e) {

        }
    }
}
