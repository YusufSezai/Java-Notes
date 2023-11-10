package stringBasics;

public class Deneme {
    public static void main(String[] args) {
        String myString = "Hello Everybody";
        char ch;
        String modified = "";

        for(int i = 0; i < myString.length(); i++) {
            ch =myString.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' ||
                    ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                modified += '*';
            }
            else {
                modified += ch;
            }
        }
        System.out.println(modified);
    }

}
