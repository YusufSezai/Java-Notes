package stringBasics;

public class ReplaceMethod {
    public static void main(String[] args) {
        String myString = "The brown dog jumps over the lazy fox";

        String myReplace = myString.replace("dog", "cat");
        String myReplace1 = myString.replace(" ", "");
        String myReplace2 = myString.replace("g j", "G d");

        System.out.println(myReplace);
        System.out.println(myReplace1);
        System.out.println(myReplace2);
    }
}
