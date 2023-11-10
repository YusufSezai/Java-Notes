package fliesWritingReading.studentFolder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Tokens {
    public static void main(String[] args) {
        String path = "C:/Users/PC/Desktop/deneme.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line = reader.readLine();
            String [] tokens = line.split(" ");
            for (String t : tokens) {
                System.out.println(t);
            }
            reader.close();
        } catch (IOException e) {

        }
    }
}
