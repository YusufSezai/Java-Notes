package fliesWritingReading;
import java.io.*;

public class ReadingLinesAndCharactersCount {
    public static void main(String[] args) {
        String path = "C:/Users/PC/Desktop/deneme.txt";
        try {

            BufferedReader reader = new BufferedReader(new FileReader(path));

            int lines = 0;
            int characters = 0;
            String line;

            while ((line = reader.readLine()) != null) {
                lines++;
                characters += line.length();
            }

            reader.close();

            System.out.println(lines + " lines");
            System.out.println(characters + " characters");

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
/*
  String path = args[0];
    //add code below this line
    try {
      BufferedReader reader = new BufferedReader(new FileReader(path));
      int lineCount = 0;
      int characterCount = 0;
      while (reader.ready()) {
        String line = reader.readLine();
        lineCount++;
        characterCount += line.length();
      }
      System.out.println(String.valueOf(lineCount) + " lines");
      System.out.println(String.valueOf(characterCount) + " characters");
      reader.close();
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished reading a file.\n");
    }
 */