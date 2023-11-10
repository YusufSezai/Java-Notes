package custom_methods;

public class PalindromeWithHelper {
    public static String reverse(String s) {
        int index = s.length()-1;
        String reversed = "";

        for (int i = s.length()-1 ; i >= 0 ; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }

    public static boolean isPalindrome(String s) {
        if (s.equals(reverse(s))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("level"));
    }
}
