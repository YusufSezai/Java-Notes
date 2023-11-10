package stringBasics;

public class SubstringMethod {
    public static void main(String[] args) {
        String myString = "The brown dog jumps over the lazy fox";

        String mySlice = myString.substring(4, 9);
        String mySlice1 = myString.substring(0, myString.length());
        String mySlice2 = myString.substring(4, myString.length());
        String mySlice3 = myString.substring(10);

        System.out.println(mySlice);
        System.out.println(mySlice1);
        System.out.println(mySlice2);
        System.out.println(mySlice3);
    }
}
