package custom_methods;

import java.util.Scanner;

public class Average {
    public static double getAvg(double x, double y) {
        return (x + y) / 2;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            //double x = Double.parseDouble(args[0]);
            //double y = Double.parseDouble(args[1]);
            System.out.println(getAvg(x,y));
        } catch (Exception e) {
            System.out.println("Enter a valid number");
        }
    }

}
