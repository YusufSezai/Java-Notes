package custom_methods;

import java.util.Scanner;

public class getSlope02 {
    static double input1;
    static double input2;
    static double input3;
    static double input4;
    public static String getSlope(double x1, double y1, double x2, double y2) {
        double yChange = y2 - y1;
        double xChange = x2 - x1;
        return yChange + " / " + xChange;
    }

    public static void main(String args[]) {
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

        System.out.println(getSlope(input1, input2, input3, input4));
    }
}
