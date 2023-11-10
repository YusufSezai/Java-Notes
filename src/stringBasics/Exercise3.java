package stringBasics;

public class Exercise3{
    public static void main(String[] args) {
        String original = "HelDo1";
        String modified = "";
        char ch;



        for (int i = 0; i < original.length(); i++) {
            ch = original.charAt(i);
            if (Character.isUpperCase(ch)) {
                modified += "u";
            } else if (Character.isLowerCase(ch)) {
                modified += "l";
            } else {
                modified += "-";
            }
        }
        System.out.println(modified);
    }
}
