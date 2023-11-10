package fliesWritingReading.studentFolder;
/*
Problem
Write a program that reads a comma delimited CSV file and prints all of the cities which reside in the Southern Hemisphere. Note, any latitude with a negative value is south of the equator.
 */
public class CSV03 {
    public static void main(String[] args) {
/*
import java.io.*;
import com.opencsv.*;
import org.apache.commons.lang3.ObjectUtils;
import java.util.ArrayList;

public class Exercise5 {
  public static void main(String args[]) {

    String path = args[0];
    //add code below this line
    ArrayList<String> cities = new ArrayList<String>();
    try {
      CSVReader reader = new CSVReader(new FileReader(path));
      reader.skip(1);
      for (String[] row : reader) {
        if (Integer.parseInt(row[2]) < 0) {
          cities.add(row[0]);
        }
      }
      System.out.print("The following cities are in the Southern Hemisphere: ");
      for (String city : cities) {
        int lastCity = cities.size() - 1;
        if (city.equals(cities.get(lastCity))) {
          System.out.println(city + ".");
        } else {
          System.out.print(city + ", ");
        }
      }
      reader.close();
    } catch (Exception e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished reading a CSV");
    }
    //add code above this line
  }
}
 */
    }
}
/*
import java.io.*;
import com.opencsv.*;
import org.apache.commons.lang3.ObjectUtils;
import java.util.ArrayList;
import java.util.List;
public class Exercise5 {
  public static void main(String args[]) {

    String path = args[0];
    //add code below this line
List<String> southernHemisphereCities = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            boolean isFirstLine = true; // To skip the header
            while ((line = br.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue; // Skip the header line
                }

                String[] parts = line.split(",");
                String city = parts[0].trim();
                int latitude = Integer.parseInt(parts[2].trim());

                if (latitude < 0) {
                    southernHemisphereCities.add(city);
                }
            }
        } catch (IOException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("An error occurred: " + e.getMessage());
            return;
        }

        if (southernHemisphereCities.isEmpty()) {
            System.out.println("No cities found in the Southern Hemisphere.");
        } else {
            System.out.print("The following cities are in the Southern Hemisphere: ");
            for (int i = 0; i < southernHemisphereCities.size(); i++) {
                System.out.print(southernHemisphereCities.get(i));
                if (i < southernHemisphereCities.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }


    //add code above this line
  }
}
 */