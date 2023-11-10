package custom_methods;

import java.util.Scanner;

public class GetSlope03HelperMethod {
    static double input1;
    static double input2;
    static double input3;
    static double input4;

    public static double getRise(double y1, double y2) {
        return y2 - y1; // rise of a slope
    }
    public static double getRun(double x1, double x2) {
        return x2 - x1; // run of a slope
    }

    public static double getSlopeDecimal(double x1, double y1,
                                         double x2, double y2) {
        return getRise(y1,y2) / getRun(x2,x1); // returns the slope in decimal form
    }

    public static String getSlopeFraction(double x1, double y1,
                                          double x2, double y2) {
        return getRise(y1,y2) + " / " + getRun(x2,x1); // returns the slop in fraction form
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first x-coordinate: ");
        input1 = sc.nextDouble();
        System.out.println("Enter first y-coordinate: ");
        input2 = sc.nextDouble();
        System.out.println("Enter second x-coordinate: ");
        input3 = sc.nextDouble();
        System.out.println("Enter second y-coordinate: ");
        input4 = sc.nextDouble();
        sc.close();

        System.out.print("Rise: ");
        System.out.println(getRise(input2, input4));
        System.out.print("Run: ");
        System.out.println(getRun(input1, input3));
        System.out.print("Calculated form: ");
        System.out.println(getSlopeDecimal(input1, input2, input3, input4));
        System.out.print("Slope form: ");
        System.out.println(getSlopeFraction(input1, input2, input3, input4));
    }






}
