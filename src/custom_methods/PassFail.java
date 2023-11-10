package custom_methods;

public class PassFail {

    static String result = "pass";
    public static void passFail(int grade) {
        if (grade < 65) {
            result = "fail";
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        passFail(45);
    }
}
