package conditionals;

public class Conditionals5 {
    public static void main(String args[]) {

        String x = args[0];
        //add code below this line
        switch(x) {
            case "a": case "e": case "i": case "o": case "u": System.out.println(x + " is a vowel");
                break;
            default: System.out.println(x + " is not a vowel");
                break;
        }
    }
}
/*
if( x.equals("a") || x.equals("e") || x.equals("i") || x.equals("o") || x.equals("u") )
    {System.out.println(x + " is a vowel");}
else
    {System.out.println(x + " is not a vowel");}
 */
