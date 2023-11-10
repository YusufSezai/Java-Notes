package arrays;

import java.util.ArrayList;

public class ArrayListsAlgorithms {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        String Camry = "A Camry is not available.";

        cars.add("Corolla");
        cars.add("Camry");
        cars.add("Prius");
        cars.add("RAV4");
        cars.add("Highlander");

        for (String s: cars) {
            if (s.equals("Camry")) {
                Camry = "A Camry is available.";
            }
        }
        System.out.println(Camry);
    }
}
