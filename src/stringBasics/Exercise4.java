package stringBasics;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String output = sc.next();

        int mid = output.length() / 2;

        for (int i = 0; i < mid; i++) {
            System.out.print(output.charAt(i));
        }
        for (int j = mid; j < output.length(); j++) {
            System.out.print(output.charAt(j));
        }
        System.out.println();



    }
}
/*
int inputLength = myString.length();
        int splitIndex = inputLength / 2;

        String firstHalf = myString.substring(0, splitIndex);
        String secondHalf = myString.substring(splitIndex);

        // Check if the input string has an odd number of characters
        if (inputLength % 2 != 0) {
            // If it's odd, the second half has the extra character
            secondHalf += myString.charAt(splitIndex);
        }

        System.out.println("First Half: " + firstHalf);
        System.out.println("Second Half: " + secondHalf);
 */