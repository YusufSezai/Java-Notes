package stringBasics;

public class TrimMethod {
    public static void main(String[] args) {
        String myString = "      Hello World          ";

        String myTrim = myString.trim();

        System.out.println(myString);
        System.out.println(myTrim);
    }
}
