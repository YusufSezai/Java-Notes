package custom_methods;

import java.util.ArrayList;

public class GreetingMachine {
    public static ArrayList<String> sayHello(ArrayList<String> myList) {
        ArrayList<String> newList = new ArrayList<String>();
        for (String i : myList) {
            newList.add("Hello " + i);
        }
        return newList;
    }
    /*
    public static void sayHello(ArrayList<String> names) {
        for (String s : names) {
        System.out.println("Hello " + s);
        }
    }
     */

    public static void main(String args[]) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Emel");
        names.add("Ebubekir");
        System.out.println(sayHello(names));
    }
}
