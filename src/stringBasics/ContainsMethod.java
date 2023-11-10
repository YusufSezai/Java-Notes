package stringBasics;

public class ContainsMethod {
    public static void main(String[] args) {
        String myString = "The brown dog jumps over the lazy fox";

        System.out.println(myString.contains("dog"));
        System.out.println(myString.contains("cat"));
        System.out.println(myString.contains(" "));
        System.out.println(myString.contains(myString));
    }
}
