package stringBasics;

public class SwappingTheCaseOfChars {
    public static void main(String[] args) {
        String originalString = "THE BROWN DOG JUMPS over the lazy fox";
        String modifiedString = "";
        char ch;

        for (int i = 0; i < originalString.length(); i++) {
            ch = originalString.charAt(i);
            if (Character.isLowerCase(ch)) {
                modifiedString += Character.toUpperCase(ch);
            } else {
                modifiedString += Character.toLowerCase(ch);
            }
        }
        System.out.println(modifiedString);
    }
}
