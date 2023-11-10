package custom_methods;

import java.util.ArrayList;

public class ArrayMethod2 {
    public static void printArray(ArrayList<String> arrayList) {
        int count = 0;
        for (String s: arrayList) {
            count += 1;
            System.out.println(count + " " + s);
        }
    }
    public static void main(String args[]) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Ebubekir");
        names.add("Emel");
        names.add("Adil");
        names.add("Kami");
        names.add("Bianca");
        names.add("Azra");
        printArray(names);
    }
}
