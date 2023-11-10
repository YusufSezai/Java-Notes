package arrays;

public class Array2DIterationSeperatePrintArrays {
    public static void main(String[] args) {
        int [][] digits = {{1,2,3}, {4,5,6},{7,8,9}};

        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j <digits[0].length; j++){
                if (j == digits[0].length - 1) {
                    System.out.println(digits[i][j]);
                }
                else {
                    System.out.print(digits[i][j] + " ");
                }

            }
        }
    }
}
