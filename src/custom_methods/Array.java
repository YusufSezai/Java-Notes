package custom_methods;

import java.util.ArrayList;

public class Array {

    public static ArrayList<Integer> multiplyFive(ArrayList<Integer> myList) {
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for (Integer i : myList) {
            newList.add(i * 5);
        }
        return newList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(multiplyFive(numbers));
    }
}
