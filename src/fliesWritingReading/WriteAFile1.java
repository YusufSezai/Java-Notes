package fliesWritingReading;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteAFile1 {
    public static void main(String[] args) {
        String path = "C:/Users/PC/Desktop/numlist.txt";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            String text1 = "Hello there\n";
            String text2 = "my friend";
            writer.write(text1);
            writer.write(text2);
            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finished writing to a file.");
        }

    }
}
