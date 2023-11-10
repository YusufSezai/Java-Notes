package fliesWritingReading;
import java.io.*;

public class ReadAFile {
    public static void main(String[] args) {
        String path = "C:/Users/PC/Desktop/deneme.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            System.out.println(reader.readLine());
            reader.close();
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finished reading file...");
        }
    }
}
