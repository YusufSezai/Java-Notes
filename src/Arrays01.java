public class Arrays01 {
    public static void main(String[] args) {
        String[] names = {"Alan", "Bob", "Carol", "David", "Jane"};
        int[] ages = {45, 32, 37, 25, 23};

        System.out.println(names[0] + " is " + ages[0]);

        ages[2] = 99;
        names[3] = "Jennifer";

        System.out.println(names[3]);
        System.out.println(ages[2]);

        for (String i : names) {
            System.out.println(i);
        }

    }
}
