package custom_methods;

public class TriangleMethod {
    public static double getBaseHeight(double b, double h) {
        return b * h;
    }
    public static double getTriangleArea( double b,double h) {
        return getBaseHeight(b,h) / 2;
    }

    public static void main(String[] args) {
        System.out.println(getTriangleArea(3,4));
    }
}
