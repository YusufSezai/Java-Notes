public class Conditionals3 {
    public static void main(String args[]) {

        int x = Integer.parseInt(args[0]);
        //add code below this line
        if (x % 5 == 0 && x % 2 == 0) {
            System.out.println(x + " is divisible by 5 and even");

        }
        else {
            System.out.println(x + " is not divisible by 5 or it is odd");
        }


        //add code above this line
    }
}
