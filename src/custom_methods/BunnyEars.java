package custom_methods;

public class BunnyEars {
    public static int bunnyEars(int bunny) {
        if (bunny == 0) {
            return 0;
        } else {
            return 2 + bunnyEars(bunny-1);
        }
    }

    public static void main(String[] args) {

        int ear = bunnyEars(5);
        System.out.println(ear);
    }
}
