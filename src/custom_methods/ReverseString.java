package custom_methods;

public class ReverseString {
    public static String reverseString(String s) {
        String n = "";
        for (int i = s.length()-1; i >= 0; i--) {
          n += s.charAt(i);
        }
        return n;
    }

    public static void main(String[] args) {
        String a = reverseString("yusuf");
        System.out.println(a);
    }
}
/*
public static String reverseString(String s) {
        // Base case: if the string is empty or has only one character, return the string
        if (s.isEmpty() || s.length() == 1) {
            return s;
        }
        // Recursive call: append the last character to the reversed substring
        return reverseString(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String a = reverseString("yusuf");
        System.out.println(a); // This will print the reversed string
    }
 */