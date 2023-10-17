import java.util.ArrayList;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(51);
        numbers.add(13);
        numbers.add(43);
        numbers.add(21);
        numbers.add(38);
        numbers.remove(1);
        numbers.add(1, 54);
        numbers.set(0,21);

        System.out.println(numbers.get(3));
        System.out.println(numbers);
    }
}
