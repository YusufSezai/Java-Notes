package custom_methods;

public class RecursiveSum {
    public static int recursiveSum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + recursiveSum(n-1);
        }
    }

    public static void main(String[] args) {
        int m = recursiveSum(5);
        System.out.println(m);
    }
}



