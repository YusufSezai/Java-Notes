package stringBasics;

public class Basics {
    public static void main(String[] args) {
        String myString = "Hello";

        int lenString = myString.length();
        char character = myString.charAt(1);
        char character1 = myString.charAt(myString.length()-1);

        System.out.println(myString);
        System.out.println(lenString);
        System.out.println(character);
        System.out.println(character1);
    }
}
