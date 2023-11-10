package custom_methods;

public class ReturnValues01 {
    public static int returnInt(int x, int y) {
        return x + y;
    }
    public static double returnDouble(double x, double y) {
        return x + y;
    }

    public static String returnString(String x, String y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(returnInt(1,2));
        System.out.println(returnDouble(1,2));
        System.out.println(returnString("1","2"));
    }
}
