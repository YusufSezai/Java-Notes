package fliesWritingReading.studentFolder;
/*
Problem
Write a program that reads a tab delimited CSV file and prints the name of the oldest person in the file.
 */
public class CSV02 {
    public static void main(String[] args) {
        /*
        String path = args[0];
    //add code below this line
    try {
      BufferedReader reader = new BufferedReader(new FileReader(path));
      String delimiter = "\t";
      int oldestAge = 0;
      String oldestName = "";
      while(reader.ready()) {
        String line = reader.readLine();
        String[] tokens = line.split(delimiter);
        if (Integer.parseInt(tokens[1]) > oldestAge) {
          oldestAge = Integer.parseInt(tokens[1]);
          oldestName = tokens[0];
        }
      }
      System.out.println("The oldest person is " + oldestName + ".");
      reader.close();
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished reading a CSV");
    }
         */
    }
}
/*
String path = args[0];
    //add code below this line
     try {
            java.io.FileReader fileReader = new java.io.FileReader(path);
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(fileReader);

            String line;
            String oldestPersonName = "";
            int maxAge = Integer.MIN_VALUE;

            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split("\t"); // Split the line by tabs
                if (parts.length == 3) {
                    String name = parts[0];
                    int age = Integer.parseInt(parts[1]);

                    if (age > maxAge) {
                        maxAge = age;
                        oldestPersonName = name;
                    }
                }
            }

            bufferedReader.close();

            if (!oldestPersonName.isEmpty()) {
                System.out.println("The oldest person is " + oldestPersonName + ".");
            } else {
                System.out.println("No records found in the file.");
            }

        } catch (java.io.IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
 */