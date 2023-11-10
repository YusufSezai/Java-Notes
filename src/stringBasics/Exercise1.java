package stringBasics;

public class Exercise1 {
    public static void main(String[] args) {
        String myString = "Hello Everybody";

        char ch1 = myString.charAt(0);
        char ch2 = myString.charAt(myString.length()-1);

        System.out.println(ch1 + " is the first character and "+ ch2 + " is the last character");
    }
}
