public class Array2D01 {
    public static void main(String[] args) {
        String[][] names = { {"Alan", "Bob", "Carol", "David", "Ellen"},
                             {"Fred", "Grace", "Henry", "Ian", "Jen"},
                             {"Kelly", "Liam", "Mary", "Nancy", "Owen"} };

        System.out.println(names[1][2]);

        names[1][2] = "Harry";

        System.out.println(names[1][2]);
        System.out.println(names[2][1]);
    }
}
