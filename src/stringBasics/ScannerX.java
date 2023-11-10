import java.util.Scanner;
public class ScannerX {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter second number: ");
        int secondNum = sc.nextInt();

        int sum = firstNum + secondNum;
        System.out.print(firstNum+ " + " + secondNum + " = " + sum);

    }

}
