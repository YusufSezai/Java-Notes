package custom_methods;

import java.util.ArrayList;

public class OddEven {
    public static void getOddsEvens(boolean myBool, ArrayList<Integer> myNum) {
        if (myBool) {
            for (int num : myNum) {
                if (num % 2== 0) {
                    System.out.println(num);
                }
            }
        } else {
            for (int num : myNum) {
                if (num / 2 != 0) {
                    System.out.println(num);
                }
            }
        }

    }

    public static void main(String[] args) {
        boolean x= true;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        getOddsEvens(x,numbers);
    }
}
