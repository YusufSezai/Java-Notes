package fliesWritingReading;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class WriteAFile3 {
    public static void main(String[] args) {
        //add code below this line
        String path = "C:/Users/PC/Desktop/numlist.txt";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            String text1 = "Hello there";
            String text2 = "my friend";
            writer.write(text1);
            writer.newLine();
            writer.write(text2);
            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finished writing to a file.");
        }
        //add code above this line
    }
}
/*
 writer.write(text1, 6, 5);
      writer.newLine();
      writer.write(text2, 0, 4);
 */