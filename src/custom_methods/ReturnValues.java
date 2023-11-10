package custom_methods;

public class ReturnValues {
    public static int addFive(int num) {
        return (num + 5);
    }

    public static void main(String[] args) {
        int newNum = addFive(10);
        System.out.println(newNum);
    }
}
