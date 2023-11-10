package arrays;

public class Array2DExmpl {
    public static void main(String[] args) {
        String[][] names = new String[3][2];
        names[0][1] = "First name";
        names[0][0] = "Last name";
        names[2][0] = "Man";
        names[1][1] = "Peter";
        names[1][0] = "Parker";
        names[2][1] = "Spider";

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[0].length; j++) {
                if (j == names[0].length - 1) {
                    System.out.println(names[i][j]);
                }
                else {
                    System.out.print(names[i][j] + " ");
                }
            }
        }
    }
}
