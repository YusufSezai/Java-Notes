package stringBasics;

import java.util.Scanner;

public class SwapLettersTwoAtATime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with an even number of characters: ");
        String input = scanner.nextLine();

        if (input.length() % 2 != 0) {
            System.out.println("Error: Input must have an even number of characters.");
        } else {
            String swapped = swapLettersTwoAtATime(input);
            System.out.println("Swapped string: " + swapped);
        }

        scanner.close();
    }

    public static String swapLettersTwoAtATime(String input) {
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length - 1; i += 2) {
            char temp = charArray[i];
            charArray[i] = charArray[i + 1];
            charArray[i + 1] = temp;
        }
        return new String(charArray);
    }
}
/*
for (int i = 0; i < myString.length(); i++) {
  if (i % 2 == 0) {
    System.out.print(myString.charAt(i + 1));
  }
  else {
    System.out.print(myString.charAt(i - 1));
  }
}
 */