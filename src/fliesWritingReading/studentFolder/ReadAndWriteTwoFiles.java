package fliesWritingReading.studentFolder;

import java.io.*;

public class ReadAndWriteTwoFiles {
    public static void main(String[] args) {
        String readPath = "C:/Users/PC/Desktop/deneme.txt";
        String writePath = "C:/Users/PC/Desktop/denemeWrite.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(readPath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(writePath));
            while (reader.ready()) {
               // writer.write(reader.readLine()); // writes all file as a single line
               // writer.write(reader.readLine() + "\n"); // writes all file same as original
               // writer.write(reader.readLine().toUpperCase() + "\n"); // writes same as original as uppercase
            }
            reader.close();
            writer.close();
        } catch (IOException e) {

        }
    }
}
