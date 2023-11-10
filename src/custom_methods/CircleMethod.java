package custom_methods;

public class CircleMethod {
    public static double findRadius(double x1, double y1, double x2, double y2) {
        return (Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)));
    }
    public static double findArea(double x1, double y1, double x2, double y2) {
        return (Math.PI * Math.pow(findRadius(x1,y1,x2,y2), 2));
    }

    public static void main(String[] args) {
        System.out.println(findArea(0.0,0.0,4.0,4.0));
    }
}
