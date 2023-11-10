package stringBasics;

public class StartsWithMethod {
    public static void main(String[] args) {
        String myString = "The brown dog jumps over the lazy fox";

        boolean myBool = myString.startsWith("The");
        boolean myBool1 = myString.startsWith("brown", 4);

        System.out.println(myBool);
        System.out.println(myBool1);

    }
}
