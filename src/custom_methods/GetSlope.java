package custom_methods;

public class GetSlope {
    public static void getSlope(double x1, double y1, double x2, double y2) {
        System.out.println((y2-y1) / (x2-x1));
    }

    public static void main(String[] args) {
        getSlope(3,2,5,6);
    }
}
