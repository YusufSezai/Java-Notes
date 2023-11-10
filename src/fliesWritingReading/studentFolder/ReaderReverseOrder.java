package fliesWritingReading.studentFolder;
import java.io.*;
import java.util.ArrayList;
/*
Problem
Write a program that reads a text file and prints the contents in reverse order.
 */


public class ReaderReverseOrder {
    public static void main(String[] args) {
        String path = args[0];
        //add code below this line
        ArrayList<String> text = new ArrayList<String>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while (reader.ready()) {
                text.add(reader.readLine());
            }
            reader.close();
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finished reading a file.\n");
        }
        for (int i = text.size() - 1; i >= 0; i--) {
            System.out.println(text.get(i));
        }
    }
}
/*
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
public class Exercise3 {
  public static void main(String args[]) {

    String path = args[0];
    //add code below this line
    try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            ArrayList<String> lines = new ArrayList<>();
            String line;

            // Read lines from the file and store in an ArrayList
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }

            bufferedReader.close();

            // Reverse the order of lines
            Collections.reverse(lines);

            // Print the contents in reverse order
            for (String l : lines) {
                System.out.println(l);
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }


    //add code above this line

  }
}
 */