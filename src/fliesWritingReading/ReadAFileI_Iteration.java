package fliesWritingReading;
import java.io.*;
public class ReadAFileI_Iteration {
    public static void main(String[] args) {
        String path = "C:/Users/PC/Desktop/deneme.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String currentLine = reader.readLine();
            while (currentLine != null) {
                System.out.println(currentLine);
                currentLine = reader.readLine();
            }
        } catch (IOException e) {

        }
    }
}
