package custom_methods;

import java.util.Scanner;

public class GetSlope01 {

    static double input1;
    static double input2;
    static double input3;
    static double input4;

    public static void getSlope(double x1, double y1, double x2, double y2) {
        double yChange = y2 - y1;
        double xChange = x2 - x1;
        System.out.println(yChange/xChange);
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

        getSlope(input1,input2,input3,input4);
    }

}
