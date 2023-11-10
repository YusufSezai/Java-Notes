package arrays;

import java.util.ArrayList;

public class ArrayListIteration {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);
        numbers.add(16);
        numbers.add(17);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        ArrayList<String> words = new ArrayList<String>();
        words.add("Bob");
        words.add("Jill");
        words.add("Betty");
        words.add("Herb");
        words.add("James");

        for (String i : words) {
            System.out.println(i);
        }


    }
}
