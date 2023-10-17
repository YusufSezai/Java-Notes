import java.util.ArrayList;

public class ArrayAndArrayListTogether {
    public static void main(String[] args) {
        String[] top = {"First seat: ", "Second seat: ", "Third seat: ", "Fourth seat: ", "Fifth seat: "};
        ArrayList<String> names = new ArrayList<String>();
        names.add("Bob");
        names.add("Jill");
        names.add("Betty");
        names.add("Herb");
        names.add("James");

        for (int i = 0; i < names.size(); i++) {    // i < 5
            System.out.println(top[i] + names.get(i));
        }

    }
}
