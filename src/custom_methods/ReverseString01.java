package custom_methods;

public class ReverseString01 {
    public static String reverseString( String s) {
        if (s.length() <= 1) {
            return s;
        } else {
            return reverseString(s.substring(1)) +s.charAt(0);
            // return s.substring(s.length() - 1) + reverseString(s.substring(0, s.length() - 1));
        }
    }

    public static void main(String[] args) {
        String a = reverseString("Yusuf");
        System.out.println(a);
    }
}
