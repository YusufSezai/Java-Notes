package fliesWritingReading;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteAFile {
    public static void main(String[] args) {
        String path = "C:/Users/PC/Desktop/practice1.txt";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            String text = "Hello there";
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Finished writing to the file");
        }

    }
}
