package fliesWritingReading;
import java.io.*;

public class ReadinAFlie_Ireation_1 {
    public static void main(String[] args) {
        String path = "C:/Users/PC/Desktop/deneme.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String currentfile;
            while ((currentfile = reader.readLine()) != null) {
                System.out.println(currentfile);
            }
            reader.close();
        }catch (IOException e) {

        }
    }
}
