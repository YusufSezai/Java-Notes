package arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayNumsAvg {
    public static void main(String args[]) {
        int input;
        int total = 0;
        double avg = 0;
        ArrayList<Integer> numList = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer to add to the total, or type a non-integer to find the total average:");

        while (sc.hasNextInt()) {
            input = sc.nextInt();
            numList.add(input);
        }

        // Calculate the total and average after the loop
        for (int num : numList) {
            total += num;
        }

        if (!numList.isEmpty()) {
            avg = (double) total / numList.size();
        }

        System.out.println("Average: " + avg);
    }
}


