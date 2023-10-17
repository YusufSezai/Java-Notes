public class Conditionals4 {
    public static void main(String args[]) {

        String x = args[0];
        //add code below this line
        switch(x) {
            case "red": System.out.println(x + " is a primary color");
                break;
            case "blue": System.out.println(x + " is a primary color");
                break;
            case "yellow": System.out.println(x + " is a primary color");
                break;
            default: System.out.println(x + " is not a primary color");
        }
    }
}
/*
switch (x) {
    case "yellow": case "red": case "blue": System.out.println(x + " is a primary color"); break;
    default: System.out.println(x + " is not a primary color"); break;
}
if( x.equals("yellow") || x.equals("red") || x.equals("blue") )
    {System.out.println(x + " is a primary color");}
else
    {System.out.println(x + " is not a primary color");}

 */