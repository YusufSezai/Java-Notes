package arrays;

import java.util.ArrayList;

public class ArrayListsMinMax {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<Integer>();
        grades.add(72);
        grades.add(84);
        grades.add(63);
        grades.add(55);
        grades.add(98);

        int min = grades.get(0);

        for (int i : grades) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println("The lowest grade is " + min);
    }
}
