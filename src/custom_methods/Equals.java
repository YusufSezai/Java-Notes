package custom_methods;

public class Equals {
    public static void main(String[] args) {
        String s = "Hello";
        String s1 = "Hello";

        String n = new String("Hello");
        String n1 = new String("Hello");

        System.out.println(s.equals(s1));
        System.out.println(n.equals(n1));

        System.out.println(s == n);
        System.out.println(s == s1);

    }
}
