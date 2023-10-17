public class ForLoop02 {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5};
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        System.out.println(sum);

    }
}
