package stringBasics;

public class CountingTheVowels {
    public static void main(String[] args) {
        String myString = "The Brown Dog Jumps Over The Lazy Fox";
        char ch;
        int count = 0;

        for (int i = 0; i < myString.length(); i++) {
            ch = myString.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u' || ch == 'A' ||
                    ch == 'E' || ch == 'I' || ch == 'O' ||
                    ch == 'U') {
                count += 1;

            }
        }
        if (count == 0) {
            System.out.println("There are no vowels in the string.");
        }
        else if (count == 1) {
            System.out.println("There is 1 vowel in the string.");
        }
        else {
            System.out.println("There are " + count + " vowels in the string.");
        }
    }
}
