package stringBasics;

public class ReverseString {
    public static void main(String[] args) {
        String myString = "The brown dog jumps over the lazy fox";
        String reversedString = "";
        int index = myString.length() - 1;

        while (index >= 0) {
            reversedString += myString.charAt(index);
            index -= 1;
        }
        System.out.println(reversedString);
    }
}
