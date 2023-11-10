package custom_methods;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        String reversed = "";
        int index = s.length() - 1;

        while (index >= 0) {
            reversed += s.charAt(index);
            index -= 1;
        }

        /*
        for (int i = x.length() - 1; i >= 0; i--) {
            y += x.charAt(i);
        }
         */
        if (s.equals(reversed)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Level"));
    }
}
